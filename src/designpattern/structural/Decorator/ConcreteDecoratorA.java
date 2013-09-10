package designpattern.structural.Decorator;

public class ConcreteDecoratorA extends Decorator {

	
	public ConcreteDecoratorA(Component component) {
		
		super(component);
		
	}
	

	@Override
	public void operation() {
		
		System.out.println("ConcreteDecoratorA");
		
		component.operation();
	}

}
