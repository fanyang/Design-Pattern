package designpattern.gof.behavioral.strategy;

public class Context {
	
	private Strategy strategy;
	
	
	public void contextInterface() {
		
		strategy.algorithmInterface();
		
	}
	
	
	public void setStrategy(Strategy strategy) {
		
		this.strategy = strategy;
		
	}

}
