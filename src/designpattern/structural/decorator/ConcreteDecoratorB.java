package designpattern.structural.decorator;

public class ConcreteDecoratorB extends Decorator {

	
	public ConcreteDecoratorB(Component component) {
		
		super(component);
		
	}

	
	@Override
	public void operation() {
		
		System.out.println("ConcreteDecoratorB");
		
		component.operation();
	}

}
