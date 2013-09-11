package designpattern.behavioral.interpreter;

public class Client {

	public static void main(String[] args) {

		AbstractExpression expression = new NonterminalExpression(
				new TerminalExpression()
				);
		
		Context context = new Context();
		
		
		expression.interpret(context);
		
	}

}
