package designpattern.structural.proxy;

public class Client {

	public static void main(String[] args) {

		Subject subject = new Proxy(new RealSubject());
		
		subject.request1();
		
		subject.request2();
		
	}

}
