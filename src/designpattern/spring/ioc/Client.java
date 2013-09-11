package designpattern.spring.ioc;

import java.util.List;

public class Client {

	public static void main(String[] args) {

		// create and configure beans
		ApplicationContext context =
		    new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});

		// retrieve configured instance
		PetStoreServiceImpl service = context.getBean("petStore", PetStoreServiceImpl.class);

		// use configured instance
		List<String> userList = service.getUsernameList();
		
		System.out.println(userList);
	}

}
