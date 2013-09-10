package designpattern.creational.singleton;

public class Client {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.instance();
		Singleton singleton2 = Singleton.instance();
		
		System.out.println(singleton1 == singleton2);
	}

}
