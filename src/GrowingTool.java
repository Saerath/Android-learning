import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrowingTool {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public void draw(Branch branch) throws IOException{
		Boolean bool = true;
		String command;
		String branchName;
		System.out.println("Write \"GROW\" to grow. \n Write \"Attach birch/oak + name\" to attach birch/oak branch");
		
		while(bool){
			command = reader.readLine().toUpperCase();
			
			switch(command){
			case "GROW":
				branch.grow();
				branch.showAttached("");
				break;
				
			case "ATTACH BIRCH":
				System.out.println("BRANCH NAME?");
				branchName = reader.readLine();
				branch.attach(new BirchBranch(branchName));
				branch.showAttached("");
				break;
				
			case "ATTACH OAK":
				System.out.println("BRANCH NAME?");
				branchName = reader.readLine();
				branch.attach(new BirchBranch(branchName));
				branch.showAttached("");
				break;
			
			default: 
				branch.showAttached("");
				bool = false;
				break;
			}
		}
	}
}
