package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Commands.*;

public class Parser {
	
	Pattern p;
	Matcher m;



	public void runParser(String command){
		String regexp = "(attach)\\s+(\\S+)\\s+to\\s+(\\S+)";
//		String regexp = "^(grow)\\s+(\\S+)$";
		String mainCommand = command;
		
		p = Pattern.compile(regexp);
		m = p.matcher(mainCommand);
		
		System.out.println(mainCommand);
		
		while(m.find()){
			for(int i=0; i<m.groupCount()+1; i++){
				System.out.println(i + ": " + m.group(i).toUpperCase());
			}
			
			Params params = Params.newBuilder().setCommandName(m.group(1)).setBranchNameOne(m.group(2)).setBranchNameTwo(m.group(3)).build();
			CommandSingleton.getInstance().cmdPool(params.getCommandName()).run(params);
			
		}
	}
	
	
}
