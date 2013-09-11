package designpattern.gof.behavioral.visitor;

public abstract class Visitor {
	
	public abstract void visitObjectStructure(ObjectStructure objectStructure);
	
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}
