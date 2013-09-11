package designpattern.spring.ioc;

public interface BeanFactory {

	public <T> T getBean(String name, Class<T> requiredType);
	
}
