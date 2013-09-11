package designpattern.structural.adapter;

public class Adapter2 implements Target{
	
	private Adaptee adaptee;
	
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	

	public void request() {
		adaptee.specialRequest();
	}
}
