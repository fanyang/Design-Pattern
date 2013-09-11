package designpattern.behavioral.memento;

public class Client {
	
	
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		originator.setState(true);
		
		Caretacker caretacker = new Caretacker();
		caretacker.setMemento(originator.createMemento());
		
		originator.setState(false);
		originator.setMemento(caretacker.getMemento());
		System.out.println(originator.getState());
		
		
		
	}

}
