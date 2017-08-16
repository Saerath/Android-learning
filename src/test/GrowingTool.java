package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Commands.CommandSingleton;

public class GrowingTool {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	BranchFactory branchFactory = new BranchFactory();
	Parser parser = new Parser();
	
	public void draw(Branch branch) throws IOException{
		Params params;
		
		branch.showAttached("");
		
		System.out.print("Command: ");
		
		while(true){
			String cmd = reader.readLine();
			params = getParams(cmd);
			execCmd(params);	
		}
		
	}
	
	public Params getParams(String cmd){	
		return parser.runParser(cmd);
	}
	
	void execCmd(Params params){
		CommandSingleton.getInstance().cmdPool(params.getCommandName()).run(params);		
	}
	
}
