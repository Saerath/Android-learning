
public class Main {

	public static void main(String [ ] args){
		Branch oakCore = new OakBranch();
		Branch firstBirchBranch = new BirchBranch();
		Branch secondBirchBranch = new BirchBranch();
		Branch thirdOakBranch = new OakBranch();
		
		oakCore.attach(firstBirchBranch);
		oakCore.grow();
		oakCore.grow();

		firstBirchBranch.attach(secondBirchBranch);
		secondBirchBranch.attach(thirdOakBranch);
		thirdOakBranch.grow();

		oakCore.showAttached("");
	}


}