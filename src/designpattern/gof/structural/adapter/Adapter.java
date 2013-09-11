package designpattern.gof.structural.adapter;

public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		specialRequest();
	}

}
