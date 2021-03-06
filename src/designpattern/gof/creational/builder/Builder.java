package designpattern.gof.creational.builder;

public abstract class Builder {
	
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();

	public abstract Product getResult();
}
