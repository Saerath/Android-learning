package Commands;

import test.Branch;
import test.Params;
import test.Singleton;

public class AttachCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		if(params.getBranchNameOne() == null || params.getBranchNameTwo() == null){
			System.out.println("Something is null.");
		}else{
			System.out.println("\"Attach\" command.");
			
			Branch attachmentBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameOne());
			Branch body = Singleton.getInstance().getFromBranchMap(params.getBranchNameTwo());
			
			if(!attachmentBranch.isAttached()){
				body.attach(attachmentBranch);
			}else{
				System.out.println("Selected branch \"" + attachmentBranch.getBranchName() + "\" attached already");
			}
		}

	}
	

}
