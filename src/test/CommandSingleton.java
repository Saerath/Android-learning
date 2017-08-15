package test;
import java.util.HashMap;
import java.util.Map;
import Commands.*;

public class CommandSingleton {

	private static final String ATTACH_CMD = "ATTACH";
	private static final String GROW_CMD = "GROW";
	
	
	private Map<String, CommandHandler> commandPool = new HashMap<>();
	
	
	//--------------
	
	public CommandHandler cmdPool(String key){
		return commandPool.get(key);
	}
	
	//--------------

	
	static CommandSingleton commandSingleton = new CommandSingleton();
	
	private CommandSingleton() {
		
		commandPool.put(ATTACH_CMD, new AttachCmdHandler());
		commandPool.put(GROW_CMD, new GrowCmdHandler());
		
	}

	public static CommandSingleton getInstance(){
		return commandSingleton;
	}
	
	
}
