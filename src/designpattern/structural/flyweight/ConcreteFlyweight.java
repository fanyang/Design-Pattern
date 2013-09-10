package designpattern.structural.flyweight;

public class ConcreteFlyweight extends Flyweight {
	
	
	private String intrinsicState; 
	

	public ConcreteFlyweight(String intrinsicState) {
		
		this.intrinsicState = intrinsicState;
		
	}


	@Override
	public void operation(String extrinsicState) {

		System.out.println("Intrinsic State = "
				+ intrinsicState
				+ "  Extrinsic State = "
				+ extrinsicState
				);
	}

}
