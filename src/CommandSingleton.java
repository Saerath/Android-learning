import java.util.HashMap;
import java.util.Map;

public class CommandSingleton {

	private Map<String, Branch> commandPool = new HashMap<>();
	
	//--------------
	
	public void addToBranchMap(String key, Branch branch){
		commandPool.put(key, branch);
	}
	
	public Branch getFromBranchMap(String key){
		return commandPool.get(key);
	}
	
	//--------------

	
	static CommandSingleton commandSingleton = new CommandSingleton();
	
	private CommandSingleton() {
		
	}

	public static CommandSingleton getInstance(){
		return commandSingleton;
	}
	
	
}
