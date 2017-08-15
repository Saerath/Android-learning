package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	Pattern p;
	Matcher m;



	public void runParser(String command){
		
		Params params;
		
		String[] exp = command.split("\\s+");
		
		for(String e : exp){
			e.toUpperCase();
		}
		
		switch(exp.length){
		case 2: //for grow branch or create branch
			params = Params.newBuilder().setCommandName(exp[0]).setBranchNameOne(exp[1]).build();
			CommandSingleton.getInstance().cmdPool(params.getCommandName()).run(params);
			break;
		case 3: //for attach smth to smth
			params = Params.newBuilder().setCommandName(exp[0]).setBranchNameOne(exp[1]).setBranchNameTwo(exp[3]).build();
			CommandSingleton.getInstance().cmdPool(params.getCommandName()).run(params);
			break;
		}
		
//		String regexp = "(attach)\\s+(\\S+)\\s+to\\s+(\\S+)";
//		String regexp = "^(grow)\\s+(\\S+)$";
//		String mainCommand = command;
//		
//		p = Pattern.compile(regexp);
//		m = p.matcher(mainCommand);
//		
//		System.out.println(mainCommand);
//		
//		while(m.find()){
//			for(int i=0; i<m.groupCount()+1; i++){
//				System.out.println(i + ": " + m.group(i).toUpperCase());
//			}
//			
//			Params params = Params.newBuilder().setCommandName(m.group(1)).setBranchNameOne(m.group(2)).setBranchNameTwo(m.group(3)).build();
//			CommandSingleton.getInstance().cmdPool(params.getCommandName()).run(params);
//			
//		}
	}
	
	
}
