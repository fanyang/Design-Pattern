package designpattern.behavioral.state;

public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		
		// TODO
		
		context.setState(new ConcreteStateA());
		
	}

}
