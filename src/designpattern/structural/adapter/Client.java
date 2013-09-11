package designpattern.structural.adapter;

public class Client {

	public static void main(String[] args) {

		Target target = new Adapter();
		
		target.request();
		
		
		Target target2 = new Adapter2(new Adaptee());
		
		target2.request();
	}

}
