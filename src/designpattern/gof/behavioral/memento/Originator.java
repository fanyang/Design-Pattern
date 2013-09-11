package designpattern.gof.behavioral.memento;

public class Originator {
	
	private int state;
	
	
	public void setMemento(Memento memento) {
		
		state = memento.getState();
		
	}
	
	
	public Memento createMemento() {
		
		return new Memento(state);
		
	}


	
	public int getState() {
		
		return state;
		
	}
	
	
	public void setState(int state) {
		
		this.state = state;
		
	}
	
	

}
