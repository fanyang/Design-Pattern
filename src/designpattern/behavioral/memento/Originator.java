package designpattern.behavioral.memento;

public class Originator {
	
	private boolean state;
	
	
	public void setMemento(Memento memento) {
		
		state = memento.getState();
		
	}
	
	
	public Memento createMemento() {
		
		return new Memento(state);
		
	}


	
	public boolean getState() {
		
		return state;
		
	}
	
	
	public void setState(boolean state) {
		
		this.state = state;
		
	}
	
	

}
