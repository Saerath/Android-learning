package Commands;

import test.Branch;
import test.Params;
import test.Singleton;

public class GrowCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub

		if(params.getBranchNameOne() == null){
			System.out.println("Something is null.");
		}else{
			Branch growingBranch = Singleton.getInstance().getFromBranchMap(params.getBranchNameOne());
			
			System.out.println("\"Grow " + growingBranch.getBranchName() + " command.\"");
			growingBranch.grow();
		}
		
		
	}
	
	

}
