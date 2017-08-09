import java.util.*;

public abstract class AbstractBranch implements Branch {

	public final int node;
	
	Singleton singleton = Singleton.getInstance();
	
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
		this.node = singleton.getNodeNum();
		singleton.addNodeNum();
	}
	
	public AbstractBranch() {
		this.node = singleton.getNodeNum();
		this.branchName = this.getClass().getSimpleName() + " " + this.node; 
		singleton.addNodeNum();
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