package designpattern.behavioral.command;

public class Client {

	public static void main(String[] args) {

		Invoker invoker = new Invoker();
		Command command = new ConcreteCommand(new Receiver());
		
		invoker.addCommand(command);
		
		invoker.invoke();
		
		
	}

}
