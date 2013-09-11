package designpattern.gof.structural.flyweight;

public class Client {

	public static void main(String[] args) {

		Flyweight flyweight = FlyweightFactory.getFlyweight("intrinsicState");
		
		flyweight.operation("extrinsicState");
		
	}

}
