package designpattern.gof.structural.composite;

public class Client {
	
	
	public static void main(String[] args) {
		
		Component component = new Composite();
		component.addComponent(new Leaf());
		
		Component component2 = new Composite();
		component2.addComponent(new Leaf());
		
		component.addComponent(component2);
		
		component.operation();
	}
	
}
