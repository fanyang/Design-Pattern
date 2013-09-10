package designpattern.creational.prototype;

public class Client {
	
	private Prototype prototype;
	
	
	public void operate(Prototype prototype) {
		
		this.prototype = prototype.clone();

	}
	
	
	public Prototype getPrototype() {
		
		return prototype;
		
	}

	
	public static void main(String[] args) {
		Client client = new Client();
		
		Prototype prototype = new ConcretePrototype();
		client.operate(prototype);
		
	}

}
