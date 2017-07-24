
public class OakBranch extends AbstractBranch {

	public void grow() {
		attachedBranches.add(new OakBranch());
	}

}
