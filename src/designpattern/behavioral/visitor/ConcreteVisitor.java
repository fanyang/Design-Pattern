package designpattern.behavioral.visitor;

public class ConcreteVisitor extends Visitor{

	
	@Override
	public void visitObjectStructure(ObjectStructure objectStructure) {

		for (Element element : objectStructure) {
			element.accept(this);
		}
		
	}
	
	
	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		
		concreteElementA.operationA();

	}
	

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {

		concreteElementB.operationB();
		
	}

}
