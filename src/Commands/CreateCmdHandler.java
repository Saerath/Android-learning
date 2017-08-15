package Commands;

import test.BranchFactory;
import test.Params;

public class CreateCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		BranchFactory branchFactory = new BranchFactory();
		branchFactory.create(params.getBranchType(), params.getBranchNameOne());	
	}
	
}
