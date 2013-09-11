package designpattern.gof.creational.builder;

public class ConcreteBuilder extends Builder {
	
	private Product product;
	
	
	public ConcreteBuilder() {
		product = new Product();
	}
	

	@Override
	public void buildPartA() {
		product.add(new PartA("PartA"));
	}

	
	@Override
	public void buildPartB() {
		product.add(new PartA("PartB"));
	}

	
	@Override
	public void buildPartC() {
		product.add(new PartA("PartC"));
	}
	
	
	@Override
	public Product getResult() {
		return product;
	}
}
