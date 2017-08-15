package Commands;

import test.Branch;
import test.Params;
import test.Singleton;

public class AttachCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		System.out.println("\"Attach\" command.");
		
		Branch selectedBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameOne());
		Branch staticBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameTwo());
		
		if(!selectedBranch.isAttached()){
			staticBranch.attach(selectedBranch);
		}else{
			System.out.println("Selected branch \"" + selectedBranch.getBranchName() + "\" attached already");
		}
			
		Singleton.getInstance().getFromBranchMap("CORE").showAttached("");
	}
	

}
