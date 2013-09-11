package designpattern.gof.behavioral.state;

public class ConcreteStateA extends State {

	@Override
	public void handle(Context context) {
		
		// TODO
		
		context.setState(new ConcreteStateB());
		
	}

}
