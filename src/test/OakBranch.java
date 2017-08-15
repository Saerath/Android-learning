package test;

public class OakBranch extends AbstractBranch {
	
	String branchPrefix = "--";
	
	public OakBranch(String branchName) {
		super(branchName);
	}

	
	public OakBranch() {
		
	}

	
	public void grow() {

		for(Branch a:attachedBranches){
			a.grow();
		}
		attach(new OakBranch());
	}


	@Override
	public int getNode() {
		// TODO Auto-generated method stub
		return this.node;
	}


	@Override
	public String getBranchPrefix() {
		// TODO Auto-generated method stub
		return branchPrefix;
	}



}
