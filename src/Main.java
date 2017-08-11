public class Main {

	public static void main(String [ ] args){
//		Branch oakCore = new OakBranch("CORE");		
//		GrowingTool growingTool = new GrowingTool();
//		
//		oakCore.grow();
//		oakCore.grow();
//		oakCore.attach(new BirchBranch("HAHA"));
//		
//		oakCore.showAttached("");
//		
//		while(true){
//			growingTool.createBranch();
//			growingTool.selectBranchToAttach(oakCore);
//		}
		
		Parser parser = new Parser();
		parser.run("grow core");
		
	}
	
	
	
}