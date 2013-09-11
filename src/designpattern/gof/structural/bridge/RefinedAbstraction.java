package designpattern.gof.structural.bridge;

public class RefinedAbstraction extends Abstraction {

	
	public RefinedAbstraction(Implementor implementor) {
		
		super(implementor);
		
	}
	
	
	@Override
	public void operation() {
		
		System.out.println("RefinedAbstraction operation.");
		
		implementor.operationImp();
	}

}
