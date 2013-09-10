package designpattern.structural.bridge;

public class Client {

	public static void main(String[] args) {

		Implementor implementor = new ConcreteImplementorA();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		
		abstraction.operation();
	}

}
