package designpattern.behavioral.observer;

public class Client {

	public static void main(String[] args) {

		ConcreteSubject concreteSubject = new ConcreteSubject();
		ConcreteObserver concreteObserver = new ConcreteObserver();
		concreteObserver.setSubject(concreteSubject);
		
		concreteSubject.attach(concreteObserver);
		concreteSubject.nodify();
		
		
	}

}
