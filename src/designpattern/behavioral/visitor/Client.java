package designpattern.behavioral.visitor;

public class Client {

	public static void main(String[] args) {

		ObjectStructure objectStructure= new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		
		Visitor visitor= new ConcreteVisitor();
		visitor.visitObjectStructure(objectStructure);
		
		
	}

}
