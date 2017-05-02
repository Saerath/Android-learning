import java.util.*;

public class AbstractBranch implements Branch {
	
//	String branchName;
//	
//	public AbstractBranch(String branchName){
//		this.branchName = branchName;
//	}

	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void grow(Branch branch){
		attachedBranches.add(branch);
	}
	
	public void doubleGrow(Branch branch){
		grow(branch);
		grow(branch);
	}
	
	public void showAttached(){
		for(Branch a : attachedBranches){
			System.out.println(a);
		}
	}


}
