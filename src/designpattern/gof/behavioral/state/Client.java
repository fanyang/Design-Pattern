package designpattern.gof.behavioral.state;

public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		context.setState(new ConcreteStateA());
		
		context.request();
		context.request();
	}

}
