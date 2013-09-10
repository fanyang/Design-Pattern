package designpattern.structural.Decorator;

public class Client {

	public static void main(String[] args) {
		
		Component component = new ConcreteDecoratorA(
								new ConcreteDecoratorB(
										new ConcreteComponent()	
								)
							);
		
		component.operation();
		
	}
}
