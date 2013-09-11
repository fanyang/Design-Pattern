package designpattern.gof.behavioral.observer;

public class ConcreteSubject extends Subject {
	
	
	private int subjectState;
	
	
	public int getState() {
		
		return subjectState;
		
	}
	
	
	public void setState(int state) {
		
		subjectState = state;
		
	}
	
	

}
