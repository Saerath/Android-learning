import java.util.*;

public abstract class AbstractBranch implements Branch {
	
	String branchPrefix;

	public int node;
	static int nodeNum = 0;
	
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
		this.node = nodeNum;
		nodeNum++;
	}
	
	public AbstractBranch() {
		this.node = nodeNum;
		nodeNum++;
	}
	
	//---------------------------------
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public ArrayList<Branch> getBranches(){
		return attachedBranches;
	}
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	public abstract void grow();
	public abstract int getNode();
	public abstract String getBranchPrefix();
	
	public void showAttached(String prefix){

			System.out.println(this.getBranchPrefix() + "ROOT: " + this.getBranchName() + " \"" + this.getClass().getSimpleName() + "\"");
		
			for(Branch a : attachedBranches){
				System.out.println(a.getBranchPrefix() + "CHILD: " + a.getBranchName() + " \"" + a.getClass().getSimpleName() + "\"");
			
			}
			
			System.out.println();
			
			for(Branch a : attachedBranches){
				a.showAttached("--" + a.getBranchPrefix());
			}
		
		
	}
	

}