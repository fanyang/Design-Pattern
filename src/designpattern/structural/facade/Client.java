package designpattern.structural.facade;

import java.io.*;

public class Client {

	public static void main(String[] args) throws Exception {

		
		InputStream in = new FileInputStream("in");
		OutputStream out = new FileOutputStream("out");
		
		Compiler compiler = new Compiler(in, out);
		compiler.compile();
	}

}
