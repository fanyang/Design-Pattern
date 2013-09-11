package designpattern.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	
	private static Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

	
	public static Flyweight getFlyweight(String key) {
		
		if (flyweights.containsKey(key)) {
			
			return flyweights.get(key);
			
		} else {
			
			Flyweight flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
			return flyweight;
			
		}
		
	}

	
}
