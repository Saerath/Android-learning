
public class OakBranch extends AbstractBranch {
	
	public OakBranch(String branchName) {
		super(branchName);
	}

	public OakBranch() {
	}

	public void grow() {
		for(Branch a:attachedBranches){
			a.attach(new OakBranch());
		}
		attach(new OakBranch());
	}

}
