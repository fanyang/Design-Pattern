package designpattern.gof.structural.composite;

public abstract class Component {
	

	public abstract void operation();
	
	
	public void addComponent(Component component) {}
	
	
	public boolean removeComponent(Component component) {
		
		return false;
		
	}
	
	
}
