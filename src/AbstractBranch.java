import java.util.*;

public abstract class AbstractBranch implements Branch {
	
	String branchGen;
	static Integer gen = 1;
	
	public void setBranchGen(String gen){
		this.branchGen = gen;
	}
	
	public String getBranchGen(){ return this.branchGen;}

	public AbstractBranch() {
		setBranchGen(gen.toString());
		gen++;
	}
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	public abstract void grow();
	
	public ArrayList<Branch> getBranches(){ //Дочерние ветки
		return this.attachedBranches;
	}
	
	public void showAttached(String prefix){
		for(Branch a : attachedBranches){
			System.out.println(prefix + " " + a + ": " + getBranchGen() + " gen");
			prefix = prefix + "--";
			a.showAttached(prefix);

		}
	}
	
	

}