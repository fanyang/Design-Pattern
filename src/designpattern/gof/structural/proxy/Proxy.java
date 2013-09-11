package designpattern.gof.structural.proxy;

public class Proxy extends Subject {
	
	
	private Subject subject;
	
	
	public Proxy(Subject subject) {
		
		this.subject = subject;
		
	}
	

	@Override
	public void request1() {

		System.out.println("PreRequest1");
		subject.request1();
		System.out.println("PostRequest1");
		
	}
	
	
	@Override
	public void request2() {

		System.out.println("PreRequest2");
		subject.request2();
		System.out.println("PostRequest2");
		
	}

	
}
