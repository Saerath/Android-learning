
public class BirchBranch extends AbstractBranch {
	
	public BirchBranch(String branchName) {
		super(branchName);
	}


	public BirchBranch() {

	}


	public void grow() {
		for(Branch a:attachedBranches){
			a.attach(new BirchBranch());
		}
		attach(new BirchBranch());
	}


	@Override
	public int getNode() {
		// TODO Auto-generated method stub
		return this.node;
	}

	
	
}
