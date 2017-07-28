import java.util.*;

public abstract class AbstractBranch implements Branch {
	
	private String branchPrefix;
	private int gen;

	private String branchName;
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public AbstractBranch(String branchName) {
		this.branchName = branchName;
	}
	
	public AbstractBranch() {

	}
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	public abstract void grow();
	
	public ArrayList<Branch> getBranches(){
		return attachedBranches;
	}
	
	public void showAttached(){
		for(int i=0; i<attachedBranches.size();i++){
			System.out.println(attachedBranches.get(i).getBranchName());
		}
		
	}
	

}