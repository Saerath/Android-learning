
public class Main {

	public static void main(String [ ] args){
		Branch oakCore = new OakBranch();
		Branch firstBirchBranch = new BirchBranch();
		
		oakCore.attach(firstBirchBranch);
		oakCore.grow();
		oakCore.grow();

		oakCore.showAttached(" ");
	}


}