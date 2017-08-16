package Commands;

import test.BranchFactory;
import test.Params;

public class CreateCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		if(params.getBranchType() == null || params.getBranchNameOne() == null){
			System.out.println("Something is null.");
		}else{
			BranchFactory branchFactory = new BranchFactory();
			branchFactory.create(params.getBranchType(), params.getBranchNameOne());
		}
			
	}
	
}
