package test;

public class Main {

	public static void main(String [ ] args){
		Branch oakCore = new OakBranch("CORE");		
		
		oakCore.grow();
		oakCore.grow();
		oakCore.attach(new BirchBranch("HAHA"));
		
		oakCore.showAttached("");
			
		Parser parser = new Parser();
		Branch testBranch = new BirchBranch("TEST");
		parser.runParser("attach haha to core");
		
	}
	
	
	
}