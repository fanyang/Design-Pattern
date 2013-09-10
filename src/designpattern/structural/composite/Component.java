package designpattern.structural.composite;

public abstract class Component {
	

	public abstract void operation();
	
	
	public abstract void addComponent(Component component);
	
	
	public abstract boolean removeComponent(Component component);
	
	
}
