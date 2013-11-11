package designpattern.gof.behavioral.templatemethod;

public class Client {

	public static void main(String[] args) {

		AbstractClass abstractClass = new ConcreteClass();
		
		abstractClass.templateMethod();
	}

}
