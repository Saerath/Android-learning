
public class Main {

	public static void main(String [ ] args){
		Branch oakCore = new OakBranch();
		Branch firstBirchBranch = new BirchBranch();
		Branch secondBirchBranch = new BirchBranch();
		
		oakCore.attach(firstBirchBranch);
		oakCore.grow();
		oakCore.grow();

		firstBirchBranch.attach(secondBirchBranch);
		secondBirchBranch.grow();

		oakCore.showAttached(" " + "--");
	}


}