package designpattern.gof.behavioral.observer;

public class Client {

	public static void main(String[] args) {

		ConcreteSubject concreteSubject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		observer.setSubject(concreteSubject);
		
		concreteSubject.attach(observer);
		concreteSubject.nodify();
		
		
	}

}
