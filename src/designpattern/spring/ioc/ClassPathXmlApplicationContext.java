package designpattern.spring.ioc;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;


public class ClassPathXmlApplicationContext implements ApplicationContext {

	
	private Map<String, Object> beans = new HashMap<String, Object>();
	
	
	public ClassPathXmlApplicationContext(String... configLocations) {
		
		try {
			
			// Put beans into map.
			for (int i = 0; i < configLocations.length; i++) {
				
				InputStream inputStream = this.getClass()
						.getResource(configLocations[i]).openStream();
				
				Document document = DocumentBuilderFactory.newInstance()
						.newDocumentBuilder().parse(inputStream);
				
				Element root = document.getDocumentElement();
				NodeList beanNodes = root.getElementsByTagName("bean");
				
				for (int j = 0; j < beanNodes.getLength(); j++) {
					Element bean = (Element) beanNodes.item(j);
					String id = bean.getAttribute("id");
					String className = bean.getAttribute("class");
					
					beans.put(id, Class.forName(className).newInstance());
				}
			}
			
			// Dependency injection
			for (int i = 0; i < configLocations.length; i++) {
				
				InputStream inputStream = this.getClass()
						.getResource(configLocations[i]).openStream();
				
				Document document = DocumentBuilderFactory.newInstance()
						.newDocumentBuilder().parse(inputStream);
				
				Element root = document.getDocumentElement();
				NodeList beanNodes = root.getElementsByTagName("bean");
				
				for (int j = 0; j < beanNodes.getLength(); j++) {
					Element bean = (Element) beanNodes.item(j);
					String id = bean.getAttribute("id");
					String className = bean.getAttribute("class");
					NodeList propertiesList = bean.getElementsByTagName("property");
					
					for (int k = 0; k < propertiesList.getLength(); k++) {
						Element property = (Element) propertiesList.item(k);
						String name = property.getAttribute("name");
						String ref = property.getAttribute("ref");
						
						String methodName = "set" 
								+ name.substring(0, 1).toUpperCase()
								+ name.substring(1);
						Method method = Class.forName(className)
								.getMethod(methodName, beans.get(ref).getClass());
						//injection
						method.invoke(beans.get(id), beans.get(ref));
						
					}
					
				}
				
			}
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

		
		
	}
	

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getBean(String name, Class<T> requiredType) {
		return (T) beans.get(name);
	}
	
}
