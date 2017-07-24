
public class Main {

	public static void main(String [ ] args){
		Branch firstOakBranch = new OakBranch();
		Branch firstBirchBranch = new BirchBranch();
		
		firstOakBranch.attach(firstBirchBranch);
		firstOakBranch.grow();
		firstOakBranch.grow();
		
		firstBirchBranch.grow();
		firstBirchBranch.grow();

		firstOakBranch.showAttached();
	}


}