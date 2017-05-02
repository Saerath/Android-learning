
public class Main {

	public static void main(String [ ] args){
		Branch firstBirchBranch = new BirchBranch();
		Branch oakBranch = new OakBranch();
		Branch birchBranch = new BirchBranch();
		
		oakBranch.grow(oakBranch);
		firstBirchBranch.doubleGrow(oakBranch); 
		firstBirchBranch.grow(birchBranch);
		
		firstBirchBranch.showAttached();

		oakBranch.showAttached();
	}

}