package designpattern.gof.structural.facade;

import java.io.InputStream;
import java.io.OutputStream;

public class Compiler {
	
	
	private InputStream in;
	private OutputStream out;
	
	
	public Compiler(InputStream in, OutputStream out) {
		
		this.in = in;
		this.out = out;
		
	}
	
	
	public void compile() {
		
		Scanner scanner = new Scanner(in);
		Builder builder = new Builder();
		Parser parser = new Parser(scanner, builder);
		
		CodeGenerator.generate(parser, out);
		
	}

}
