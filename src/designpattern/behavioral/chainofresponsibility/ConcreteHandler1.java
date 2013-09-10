package designpattern.behavioral.chainofresponsibility;

public class ConcreteHandler1 extends Handler {



	@Override
	public void handleRequest(int request) {
		
		if (request < 10) {
			
			System.out.println("ConcreteHandler1");
			
		} else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}

		
		
	}

}
