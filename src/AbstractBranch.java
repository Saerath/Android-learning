import java.util.*;

public abstract class AbstractBranch implements Branch {

	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	public abstract void grow();
	
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