package Commands;

import test.Branch;
import test.Params;
import test.Singleton;

public class ShowCmdHandler implements CommandHandler {

	@Override
	public void run(Params params) {
		// TODO Auto-generated method stub
		Branch coreBranch = Singleton.getInstance().getFromBranchMap("CORE");
		coreBranch.showAttached("");
	}

}
