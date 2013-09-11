package designpattern.gof.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private List<Part> parts = new ArrayList<Part>();

	
	public void add(Part part) {
		
		parts.add(part);
		
	}
	
	
	@Override
	public String toString(){
		
		return parts.toString();
	}
	
	
}
