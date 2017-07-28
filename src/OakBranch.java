
public class OakBranch extends AbstractBranch {
	
	String branchPrefix = "++";

	public void grow() {
		for(Branch a:attachedBranches){
			a.attach(new OakBranch());
		}
		attach(new OakBranch());
	}

	public String getBranchPrefix() {
		// TODO Auto-generated method stub
		return branchPrefix;
	}

}
