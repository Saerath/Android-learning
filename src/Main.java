
public class Main {

	public static void main(String [ ] args){
		Branch firstBirchBranch = new BirchBranch();
		
		Branch second = new BirchBranch();
		
		firstBirchBranch.grow(second);
		
		second.grow(new OakBranch());
		
		firstBirchBranch.showAttached();
		System.out.println();
		second.showAttached();

	}

}