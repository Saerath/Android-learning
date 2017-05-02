
public class Main {

	public static void main(String [ ] args){
		Branch firstBirchBranch = new BirchBranch();
		Branch oakBranch = new OakBranch();
		Branch birchBranch = new BirchBranch();
		
		firstBirchBranch.doubleGrow(oakBranch); //Attach two oakBranch to fristBirchBranch
		firstBirchBranch.grow(birchBranch); //Attach one birchBranch to firstBirchBranch
		
		firstBirchBranch.showAttached();
	}

}