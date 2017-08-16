package Commands;
import java.util.HashMap;
import java.util.Map;

public class CommandSingleton {

	private static final String ATTACH_CMD = "ATTACH";
	private static final String GROW_CMD = "GROW";
	private static final String CREATE_CMD = "CREATE";
	private static final String SHOW_CMD = "SHOW";
	
	
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
		commandPool.put(CREATE_CMD, new CreateCmdHandler());
		commandPool.put(SHOW_CMD, new ShowCmdHandler());
		
	}

	public static CommandSingleton getInstance(){
		return commandSingleton;
	}
	
}
