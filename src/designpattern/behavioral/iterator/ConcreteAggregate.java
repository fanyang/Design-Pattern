package designpattern.behavioral.iterator;

public class ConcreteAggregate extends Aggregate {
	
	
	protected Object[] objects;
	
	
	public ConcreteAggregate(int length) {
		
		objects = new Object[length];
		
	}
	
	

	@Override
	public Iterator createIterator() {
		
		return new ConcreteIterator(this);
	}

}
