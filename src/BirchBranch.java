
public class BirchBranch extends AbstractBranch {

	public void grow() {
		attachedBranches.add(new BirchBranch());
	}

	
}
