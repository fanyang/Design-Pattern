package designpattern.behavioral.visitor;

public class Client {

	public static void main(String[] args) {

		ObjectStructure objectStructure= new ObjectStructure();
		ConcreteElementA concreteElementA = new ConcreteElementA();
		ConcreteElementB concreteElementB = new ConcreteElementB();
		
		objectStructure.add(concreteElementA);
		objectStructure.add(concreteElementB);
		
		Visitor visitor= new ConcreteVisitor();
		visitor.visitObjectStructure(objectStructure);
		
		
	}

}
