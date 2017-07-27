
public class BirchBranch extends AbstractBranch {
	
	String branchPrefix = "--";

	public void grow() {
		for(Branch a:attachedBranches){
			a.attach(new BirchBranch());
		}
		attach(new BirchBranch());
	}
	
	@Override
	public String getBranchPrefix() {
		// TODO Auto-generated method stub
		return branchPrefix;
	}
	
}
