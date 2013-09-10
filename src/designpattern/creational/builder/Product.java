package designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private List<Part> parts = new ArrayList<Part>();

	
	public void add(Part part) {
		this.parts.add(part);
	}
	
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		for (Part part : parts) {
			sb.append(part.getName());
		}
		
		return sb.toString();
	}
	
	
}
