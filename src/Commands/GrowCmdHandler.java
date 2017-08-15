package Commands;

import test.Branch;
import test.Params;
import test.Singleton;

public class GrowCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		Branch growingBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameOne());
		growingBranch.grow();
		
		Singleton.getInstance().getFromBranchMap("CORE").showAttached("");
		
	}
	
	

}
