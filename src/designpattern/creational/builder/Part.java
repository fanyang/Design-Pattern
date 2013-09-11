package designpattern.creational.builder;

public abstract class Part {

	private String name;
	
	
	protected Part(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		
		return this.name;
		
	}

}
