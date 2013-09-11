package designpattern.gof.behavioral.iterator;

public class Client {
	
	
	public static void main(String[] args) {
		
		Aggregate aggregate = new ConcreteAggregate(10);
		
		Iterator iterator = aggregate.createIterator();
		
		while (iterator.hasNext()) {
			
			Object object = iterator.next();
			System.out.println(object);
			
		}
		
	}

}
