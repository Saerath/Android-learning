
public class OakBranch extends AbstractBranch {

	public void grow() {
		attach(new OakBranch());
	}

}
