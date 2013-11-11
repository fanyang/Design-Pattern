package designpattern.spring.ioc;


import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class ClassPathXmlApplicationContext implements ApplicationContext {

	
	private Map<String, Object> beans = new HashMap<String, Object>();
	
	
	public ClassPathXmlApplicationContext(String... configLocations) {
		
		try {
			
			// Put all beans into HashMap.
			for (int i = 0; i < configLocations.length; i++) {
				NodeList beanNodes = getNodeList(configLocations[i]);
				
				for (int j = 0; j < beanNodes.getLength(); j++) {
					Element bean = (Element) beanNodes.item(j);
					String id = bean.getAttribute("id");
					String className = bean.getAttribute("class");
					
					beans.put(id, Class.forName(className).newInstance());
				}
			}
			
			// Dependency injection
			for (int i = 0; i < configLocations.length; i++) {
				NodeList beanNodes = getNodeList(configLocations[i]);
				
				for (int j = 0; j < beanNodes.getLength(); j++) {
					Element bean = (Element) beanNodes.item(j);
					String id = bean.getAttribute("id");
					NodeList propertiesList = bean.getElementsByTagName("property");
					
					for (int k = 0; k < propertiesList.getLength(); k++) {
						Element property = (Element) propertiesList.item(k);
						String name = property.getAttribute("name");
						String ref = property.getAttribute("ref");
						
						//injection
						PropertyDescriptor propertyDescriptor = 
								new PropertyDescriptor(name, beans.get(id).getClass());
						propertyDescriptor.getWriteMethod().invoke(beans.get(id), beans.get(ref));
						
					}
					
				}
				
			}
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

		
		
	}


	private NodeList getNodeList(String location)
			throws SAXException, IOException, ParserConfigurationException {
		InputStream inputStream = this.getClass()
				.getResourceAsStream(location);
		
		Document document = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().parse(inputStream);
		
		Element root = document.getDocumentElement();
		NodeList beanNodes = root.getElementsByTagName("bean");
		
		return beanNodes;
	}
	

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getBean(String name, Class<T> requiredType) {
		return (T) beans.get(name);
	}
	
}
