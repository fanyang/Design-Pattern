package designpattern.creational.factorymethod;

public class Client {

	public static void main(String[] args) {

		Creator creator = new ConcreteCreator();
		Product product = creator.factoryMethod();
		
		System.out.println(product);
	}

}
