import java.util.*;

public abstract class AbstractBranch implements Branch {

	public int node;
	static int nodeNum = 0;

	private String branchName;
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public AbstractBranch(String branchName) {
		this.branchName = branchName;
		this.node = nodeNum;
		nodeNum++;
	}
	
	public AbstractBranch() {
		this.node = nodeNum;
		nodeNum++;
	}
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	public abstract void grow();
	
	public abstract int getNode();
	
	public ArrayList<Branch> getBranches(){
		return attachedBranches;
	}
	
	public void showAttached(){
		for(Branch a : attachedBranches){
			System.out.println(a + ", " + a.getNode());
		}
		
	}
	

}