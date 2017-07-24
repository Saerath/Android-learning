
public class Main {

	public static void main(String [ ] args){
		Branch firstBirchBranch = new BirchBranch();
		
		Branch second = new BirchBranch();
		
		firstBirchBranch.grow();
		
		second.grow();
		
		firstBirchBranch.showAttached();
		System.out.println();
		second.showAttached();

	}

}