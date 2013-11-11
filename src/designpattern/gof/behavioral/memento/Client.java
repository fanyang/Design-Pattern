package designpattern.gof.behavioral.memento;

public class Client {
	
	
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		originator.setState(1);
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		
		originator.setState(0);
		originator.setMemento(caretaker.getMemento());
		System.out.println(originator.getState());
		
		
		
	}

}
