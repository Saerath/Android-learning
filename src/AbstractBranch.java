import java.util.*;

public class AbstractBranch implements Branch {

	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void grow(Branch branch){
		attachedBranches.add(branch);
	}
	
	public void doubleGrow(Branch branch){
		attachedBranches.add(branch);
		attachedBranches.add(branch);
	}
	
	public ArrayList<Branch> getBranches(){ //Дочерние ветки
		return this.attachedBranches;
	}
	
	public void showAttached(){
		for(Branch a : getBranches()){
			System.out.println(a);
			a.showAttached();
		}
	}

}