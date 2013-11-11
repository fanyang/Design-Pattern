package designpattern.gof.structural.decorator;

public class ConcreteDecoratorA extends Decorator {

	
	public ConcreteDecoratorA(Component component) {
		
		super(component);
		
	}
	

	@Override
	public void operation() {
		System.out.println("DecoratorA operation");
		component.operation();	
	}

}
