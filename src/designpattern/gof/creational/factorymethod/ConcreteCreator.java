package designpattern.gof.creational.factorymethod;

public class ConcreteCreator extends Creator {

	@Override
	public Product factoryMethod() {
		
		return new ConcreteProduct();
		
	}

}
