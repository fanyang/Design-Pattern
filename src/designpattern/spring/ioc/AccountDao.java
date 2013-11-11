package designpattern.spring.ioc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountDao{

	public List<String> getUsernameList() {
		
		return new ArrayList<>(Arrays.asList("Alice", "Bob", "Carol"));
		
	}

}
