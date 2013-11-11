package designpattern.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	
	protected List<Observer> observers = new ArrayList<>();
	
	
	public boolean attach(Observer observer) {
		
		return observers.add(observer);
		
	}
	
	
	public boolean detach(Observer observer) {
		
		return observers.remove(observer);
		
	}
	
	
	public void nodify() {
		
		for (Observer observer : observers) {
			
			observer.update();
			
		}
		
	}
	
	
	
}
