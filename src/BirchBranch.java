import java.util.*;

public class BirchBranch implements Branch {
	
	static ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void grow(){
		BirchBranch birchBranch = new BirchBranch();
		attachedBranches.add(birchBranch);
	}
	
	public void doubleGrow(){
		grow();
		grow();
	}
	
	public void showAttached(){
		for(Branch a : attachedBranches){
			System.out.println(a);
		}
	}

}