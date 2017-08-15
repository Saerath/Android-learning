import java.util.HashMap;
import java.util.Map;

public class CommandSingleton {

	private static final String ATTACH_CMD = "ATTACH";
	
	
	private Map<String, Command> commandPool = new HashMap<>();
	
	
	//--------------
	
	public Command cmdPool(String key){
		return commandPool.get(key);
	}
	
	//--------------

	
	static CommandSingleton commandSingleton = new CommandSingleton();
	
	private CommandSingleton() {
		
		commandPool.put("ATTACH", new AttachCmdHandler());
		
	}

	public static CommandSingleton getInstance(){
		return commandSingleton;
	}
	
	
}
