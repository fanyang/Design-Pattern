package designpattern.structural.composite;

public class Leaf extends Component {

	@Override
	public void operation() {

		System.out.println("Leaf Operation");
	}
	

	@Override
	public void addComponent(Component component) {
		
	}
	

	@Override
	public boolean removeComponent(Component component) {
		
		return false;
		
	}
	
	


}
