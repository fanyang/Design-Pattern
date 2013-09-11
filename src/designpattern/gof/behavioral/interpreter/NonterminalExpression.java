package designpattern.gof.behavioral.interpreter;

public class NonterminalExpression extends AbstractExpression{
	
	
	private AbstractExpression expression;
	

	public NonterminalExpression(AbstractExpression expression) {

		this.expression = expression;
		
	}


	@Override
	public void interpret(Context context) {

		expression.interpret(context);
	}

}
