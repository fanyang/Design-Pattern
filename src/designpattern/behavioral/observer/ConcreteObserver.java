package designpattern.behavioral.observer;

public class ConcreteObserver extends Observer{
	
	
	private int observerState;


	@Override
	public void update() {

		observerState = subject.getState();
		
	}
	
	
	public int getState() {
		
		return observerState;
		
	}

}
