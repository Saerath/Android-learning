
import java.util.HashMap;
import java.util.Map;

public class Singleton {
	
	private int nodeNum = 0;
	private Map<String, Branch> branchMap = new HashMap<>();
	
	//--------------
	
	public void addToBranchMap(String key, Branch branch){
		branchMap.put(key, branch);
	}
	
	public Branch getFromBranchMap(String key){
		return branchMap.get(key);
	}
	
	//--------------
	
	public int getNodeNum() {
		return nodeNum;
	}

	public void addNodeNum() {
		nodeNum++;
	}

	//---------------
	
	static Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		return singleton;
	}
	
	
}
