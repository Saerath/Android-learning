package Commands;

import test.Branch;
import test.Params;
import test.Singleton;

public class AttachCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		Branch attachingBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameOne());
		Branch staticBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameTwo());
		
		if(!attachingBranch.isAttached()){
			staticBranch.attach(attachingBranch);
		}else{
			System.out.println("Selected branch attached already");
		}
			
		Singleton.getInstance().getFromBranchMap("CORE").showAttached("");
	}
	

}
