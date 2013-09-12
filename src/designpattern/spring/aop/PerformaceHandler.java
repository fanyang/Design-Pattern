package designpattern.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformaceHandler implements InvocationHandler {
	
	private Object target;

	
	public PerformaceHandler(Object target) {
		
		this.target = target;
		
	}

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		Object obj = method.invoke(target, args);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Cost: " + (endTime - startTime) + "ms");
		
		return obj;
	}


}