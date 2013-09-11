package designpattern.behavioral.memento;

public class Client {
	
	
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		originator.setState(1);
		
		Caretacker caretacker = new Caretacker();
		caretacker.setMemento(originator.createMemento());
		
		originator.setState(0);
		originator.setMemento(caretacker.getMemento());
		System.out.println(originator.getState());
		
		
		
	}

}
