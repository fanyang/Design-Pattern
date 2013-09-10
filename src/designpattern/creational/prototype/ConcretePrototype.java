package designpattern.creational.prototype;

public class ConcretePrototype implements Prototype{

	@Override
	public ConcretePrototype clone() {
		
		ConcretePrototype concretePrototype = null;
		
		try {
			concretePrototype = (ConcretePrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return concretePrototype;

		
	}
	
}
