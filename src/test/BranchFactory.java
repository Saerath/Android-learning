package test;

public class BranchFactory {
	public void create(String typeOfBranch, String branchName){

		switch(typeOfBranch){
		case "BIRCH":
			new BirchBranch(branchName);
			System.out.println(branchName + " created");
			break;
			
		case "OAK":
			new OakBranch(branchName);
			System.out.println(branchName + " created");
			break;
			
		default:
			System.out.println("Can't create branch.");
			break;
		}
	}
}
