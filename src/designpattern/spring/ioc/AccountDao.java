package designpattern.spring.ioc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountDao{

	public List<String> getUsernameList() {
		
		return new ArrayList<String>(Arrays.asList("Alice", "Bob", "Carol"));
		
	}

}
