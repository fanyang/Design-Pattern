package designpattern.behavioral.chainofresponsibility;

public class ConcreteHandler2 extends Handler {



	@Override
	public void handleRequest(int request) {

		if (request >= 10) {
			
			System.out.println("ConcreteHandler2 handleRequest");
			
		} else {
			if (successor != null) {
				successor.handleRequest(request);
			}
		}

		
	}

}
