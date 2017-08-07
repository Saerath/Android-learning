
public class BranchFactory {
	public void create(String typeOfBranch, Branch branch, String branchName){

		switch(typeOfBranch.toUpperCase()){
		case "BIRCH":
			branch.attach(new BirchBranch(branchName));
			branch.showAttached("");
			break;
			
		case "OAK":
			branch.attach(new OakBranch(branchName));
			branch.showAttached("");
			break;
			
		default:
			break;
		}
	}
}
