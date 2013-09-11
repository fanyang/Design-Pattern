package designpattern.behavioral.mediator;

public abstract class Colleague {

	
	protected Mediator mediator;
	
	
	public Mediator getMediator() {
		
		return mediator;
		
	}
	
	
	public void setMediator(Mediator mediator) {
		
		this.mediator = mediator;
	
	}
	
}
