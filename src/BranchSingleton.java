
public class BranchSingleton {
	
	int nodeNum = 0;
	
	public int getNodeNum() {
		return nodeNum;
	}

	public void addNodeNum() {
		nodeNum++;
	}

	static BranchSingleton branchSingleton = new BranchSingleton();
	
	private BranchSingleton(){
		
	}

	public static BranchSingleton getInstance(){
		return branchSingleton;
	}
	
	
}
