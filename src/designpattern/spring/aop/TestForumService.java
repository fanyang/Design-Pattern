package designpattern.spring.aop;

import java.lang.reflect.Proxy;

public class TestForumService {
	
	
	public static void main(String[] args) {
		
		ForumService target = new ForumServiceImpl();
		
		PerformaceHandler handler = new PerformaceHandler(target);
		
		ForumService proxy = (ForumService) Proxy.newProxyInstance(target
				.getClass().getClassLoader(),
				target.getClass().getInterfaces(), handler);
		
		proxy.removeForum(10);
		
		proxy.removeTopic(20);
	}
	
	
}