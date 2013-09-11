package designpattern.behavioral.observer;

public class ConcreteObserver extends Observer{
	
	
	private int observerState;
	
	private ConcreteSubject subject;
	

	public Subject getSubject() {
		return subject;
	}


	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}


	@Override
	public void update() {

		observerState = subject.getState();
		
	}
	
	
	public int getState() {
		
		return observerState;
		
	}

}
