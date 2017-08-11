import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrowingTool {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	BranchFactory branchFactory = new BranchFactory();
	
	public void draw(Branch branch) throws IOException{
		
			
		
	}
	
	public void createBranch(){
		System.out.println("Choose oak/birch branch");
		String branchType;
		try {
			branchType = reader.readLine();
			System.out.println("Name for new branch:");
			String newBranch = reader.readLine().toUpperCase();
			
			branchFactory.create(branchType, newBranch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectBranchToAttach(Branch coreBranch){
		System.out.println("Select branch to attach");
		String attachingBranchName;
		String attachebleBranchName;
		
		Branch attachingBranch;
		Branch attachebleBranch;
		
		try {
			
			attachingBranchName = reader.readLine();
			attachingBranch = Singleton.getInstance().getFromBranchMap(attachingBranchName);
			
			if(attachingBranch.isAttached()){
				System.out.println("Selected branch attached already");
			}else{
				System.out.println("Select place to attach");
				
				attachebleBranchName = reader.readLine();
				attachebleBranch = Singleton.getInstance().getFromBranchMap(attachebleBranchName);
				
				attachebleBranch.attach(attachingBranch);
				
				coreBranch.showAttached("");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void growBranch(Branch coreBranch){
		System.out.println("Select branch");
		String attachebleBranchName;
		Branch attachebleBranch;
		try {
			attachebleBranchName = reader.readLine();
			attachebleBranch = Singleton.getInstance().getFromBranchMap(attachebleBranchName);
			
			attachebleBranch.grow();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		coreBranch.showAttached("");
	}
}
