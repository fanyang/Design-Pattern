package designpattern.gof.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = new ConcreteFactory1();
//		AbstractFactory abstractFactory = new ConcreteFactory2();
		
		AbstractProductA abstractProductA = abstractFactory.createProductA();
		
		AbstractProductB abstractProductB = abstractFactory.createProductB();
		
		System.out.println(abstractProductA);
		System.out.println(abstractProductB);
	}

}
