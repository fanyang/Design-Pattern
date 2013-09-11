package designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	
	private List<Command> commands = new ArrayList<Command>();
	
	
	public void addCommand(Command command) {
		
		commands.add(command);
		
	}
	
	
	public void invoke() {
		
		for (Command command : commands) {
			
			command.execute();
			
		}
		
		
		
	}

}
