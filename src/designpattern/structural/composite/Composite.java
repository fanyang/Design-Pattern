package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	
	private List<Component> children = new ArrayList<Component>();

	@Override
	public void operation() {

		for (Component child : children) {
			child.operation();
		}
	}

	@Override
	public void addComponent(Component component) {

		children.add(component);
		
	}

	@Override
	public boolean removeComponent(Component component) {
		
		return children.remove(component);
		
	}

}
