package designpattern.gof.behavioral.strategy;

public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		Strategy strategy = new ConcreteStrategyA();
		
		context.setStrategy(strategy);
		context.contextInterface();
	}

}
