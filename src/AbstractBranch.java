import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public abstract class AbstractBranch implements Branch {
	
	String branchPrefix;
	
	String branchGen;
	static Integer gen = 1;
	
	public void setBranchGen(String gen){
		this.branchGen = gen;
	}
	
	public String getBranchGen(){ 
		return this.branchGen;
	}

	public AbstractBranch() {
		setBranchGen(gen.toString());
		gen++;
	}
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	public void attach(Branch branch){
		attachedBranches.add(branch);
	}
	
	public abstract void grow();
	
	public abstract String getBranchPrefix();
	
	public ArrayList<Branch> getBranches(){ //Дочерние ветки
		return this.attachedBranches;
	}
	
	public void showAttached(String prefix){
		if (prefix.equals(this.getBranchPrefix())){
			System.out.println("Root branch: " + this + "\n");
		}
			for(Branch a : attachedBranches){
				System.out.println("	" + prefix + " " + a + ": " + getBranchGen() + " gen");
				a.showAttached(prefix + this.getBranchPrefix());
			}
		
	}
	
	public void growingCore() throws IOException{
		
		System.out.println("Type \"Grow\" to grow oak/birch branch");
		System.out.println("Type \"Attach oak/birch\" to attch oak/birch branch");
		System.out.println("Root branch: " + this + "\n");
		
		boolean bool = true;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (bool){
			String command = reader.readLine();
			switch(command.toUpperCase()){
			case "GROW":
				this.grow();
				this.showAttached(getBranchPrefix());
				System.out.println();
				break;
			case "ATTACH OAK":
				this.attach(new OakBranch());
				this.showAttached(getBranchPrefix());
				System.out.println();
				break;
			case "ATTACH BIRCH":
				this.attach(new BirchBranch());
				this.showAttached(getBranchPrefix());
				System.out.println();
				break;
			default: 
				this.showAttached(getBranchPrefix());
				bool = false;
				break;
			}
		}

	}
	

}