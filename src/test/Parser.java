package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Commands.CommandHandler;
import Commands.CommandSingleton;

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
			try{
				params = Params.newBuilder().setCommandName(exp[0]).setBranchNameOne(exp[1]).build();
				execCmd(params);	
			}catch (NullPointerException e){
				e.getMessage();
			}
			break;
			
		case 3: //for create *branch_type* *branch_name*
			try {
				params = Params.newBuilder().setCommandName(exp[0]).setBranchType(exp[1]).setBranchNameOne(exp[2]).build();
				execCmd(params);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case 4: //for attach *branch_name_one* to *branch_name_three*
			try {
				params = Params.newBuilder().setCommandName(exp[0]).setBranchNameOne(exp[1]).setBranchNameTwo(exp[3]).build();
				execCmd(params);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		default:
			System.out.println("Wrong command " + "\"" + command + "\"");
		}
		

	}
	
	void execCmd(Params params){
		CommandSingleton.getInstance().cmdPool(params.getCommandName()).run(params);
	}
	
	
}
