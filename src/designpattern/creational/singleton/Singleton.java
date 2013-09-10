package designpattern.creational.singleton;

public class Singleton {

	
	private static Singleton uniqueInstance = new Singleton();
	
	private Object singletonData;
	
	
	private Singleton() {
		
		singletonData = new Object();
		
	}
	
	
	public static Singleton instance() {
		
		return uniqueInstance;
		
	}
	
	
	public Object getSingletonData() {
		
		return singletonData;
		
	}
}
