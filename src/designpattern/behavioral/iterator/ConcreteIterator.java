package designpattern.behavioral.iterator;

public class ConcreteIterator extends Iterator{
	
	private ConcreteAggregate aggregate;
	private int nextIndex = 0;
	
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		
		this.aggregate = aggregate;
		
	}

	
	@Override
	public Object next() {
		
		return aggregate.objects[nextIndex++];
	}

	
	@Override
	public boolean hasNext() {
		
		return nextIndex < aggregate.objects.length;
		
	}
	
	

}
