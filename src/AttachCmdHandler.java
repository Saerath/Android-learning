
public class AttachCmdHandler implements Command {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		Branch firstBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameOne());
		Branch secondBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameTwo());
		secondBranch.attach(firstBranch);
		
		Singleton.getInstance().getFromBranchMap("CORE").showAttached("");
	}
	

}
