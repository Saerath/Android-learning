import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrowingTool {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	BranchFactory branchFactory = new BranchFactory();
	
	public void draw(Branch branch) throws IOException{
		
			
		
	}
	
	public void createBranch() throws IOException{
		System.out.println("Choose oak/birch branch");
		String branchType = reader.readLine();
		
		System.out.println("Name for new branch:");
		String attachingBranch = reader.readLine().toUpperCase();
		
		branchFactory.create(branchType, attachingBranch);
	}
	
	public void selectBranchToAttach(Branch branch) throws IOException{
		System.out.println("Select branch to attach");
		String attachingBranch = reader.readLine();
		if(branch.getBranchFromMap(attachingBranch).isAttached()){
			System.out.println("Selected branch attached already");
		}else{
			System.out.println("Select place to attach");
			String attachebleBranch = reader.readLine();
			branch.getBranchFromMap(attachebleBranch).attach(branch.getBranchFromMap(attachingBranch));
			
			branch.showAttached("");
		}
	}
	
	public void growBranch(Branch branch) throws IOException{
		System.out.println("Select branch");
		String attachebleBranch = reader.readLine();
		branch.getBranchFromMap(attachebleBranch).grow();
		branch.showAttached("");
	}
}
