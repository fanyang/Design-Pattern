package designpattern.structural.proxy;

public class RealSubject extends Subject {

	
	@Override
	public void request1() {

		System.out.println("RealSubject Request1");
	}
	
	
	@Override
	public void request2() {

		System.out.println("RealSubject Request2");
	}

}
