
public class Main {

	public static void main(String [ ] args){
		BirchBranch motherBirchBranch = new BirchBranch(); //Mother branch
		motherBirchBranch.grow(); //Attach to mother branch
		motherBirchBranch.doubleGrow(); //Double attach to mother branch
		
		motherBirchBranch.showAttached();
	}

}