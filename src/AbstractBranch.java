import java.util.*;

public abstract class AbstractBranch implements Branch {

	public final int node;
	
	BranchSingleton branchSingleton = BranchSingleton.getInstance();
	
	/*
	 * branchName get/set
	 */

	private String branchName;
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	//--------------------------------
	
	/*
	 * AbstractBranch constructor
	 */
	
	public AbstractBranch(String branchName) {
		this.branchName = branchName;
		this.node = branchSingleton.getNodeNum();
		branchSingleton.addNodeNum();
	}
	
	public AbstractBranch() {
		this.node = branchSingleton.getNodeNum();
		branchSingleton.addNodeNum();
	}
	
	//---------------------------------
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public ArrayList<Branch> getBranches(){
		return attachedBranches;
	}
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	//---------------------------------
	
	public abstract void grow();
	public abstract int getNode();
	public abstract String getBranchPrefix();
	
	//---------------------------------
	
	public void showAttached(String prefix){
	
		if(this.getNode()==0){
			System.out.println(this.getBranchName() + " \"" + this.getClass().getSimpleName() + "\"");
		}
			for(Branch a : attachedBranches){
				System.out.println(prefix + a.getBranchPrefix() + " " + a.getBranchName() + " \"" + a.getClass().getSimpleName() + "\"" + " NODE: " + a.getNode());
				a.showAttached(prefix+a.getBranchPrefix());	
			}
	
		
	}
	

}