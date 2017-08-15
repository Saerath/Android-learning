public class Main {

	public static void main(String [ ] args){
		Branch oakCore = new OakBranch("CORE");		
		GrowingTool growingTool = new GrowingTool();
		
		oakCore.grow();
		oakCore.grow();
		oakCore.attach(new BirchBranch("HAHA"));
		
		oakCore.showAttached("");
		
		
		
		Parser parser = new Parser();
		Branch testBranch = new BirchBranch("TEST");
		parser.runAttach("attach test to haha");
		
	}
	
	
	
}