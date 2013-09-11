package designpattern.behavioral.observer;

public abstract class Observer {

	public abstract void update();
	
	
	protected ConcreteSubject subject;
	

	public Subject getSubject() {
		return subject;
	}


	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

}
