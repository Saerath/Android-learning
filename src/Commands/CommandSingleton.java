package Commands;
import java.util.HashMap;
import java.util.Map;

public class CommandSingleton {
	
	enum cmdEnum{
		Attach("ATTACH"),
		Grow("GROW"),
		Create("CREATE"),
		Show("SHOW");
		
		private String cmd;

		cmdEnum(String cmd){
			this.cmd = cmd;
		}
		
	}

	
//	private static final String ATTACH_CMD = "ATTACH";
//	private static final String GROW_CMD = "GROW";
//	private static final String CREATE_CMD = "CREATE";
//	private static final String SHOW_CMD = "SHOW";
	
	
	private Map<String, CommandHandler> commandPool = new HashMap<>();
	
	
	//--------------
	
	public CommandHandler cmdPool(String key){
		return commandPool.get(key);
	}
	
	//--------------

	
	static CommandSingleton commandSingleton = new CommandSingleton();
	
	private CommandSingleton() {
		
		
		commandPool.put(cmdEnum.Attach.cmd, new AttachCmdHandler());
		commandPool.put(cmdEnum.Grow.cmd, new GrowCmdHandler());
		commandPool.put(cmdEnum.Create.cmd, new CreateCmdHandler());
		commandPool.put(cmdEnum.Show.cmd, new ShowCmdHandler());
		
	}

	public static CommandSingleton getInstance(){
		return commandSingleton;
	}
	
}
