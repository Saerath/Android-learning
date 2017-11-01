package test;

import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");		
		Branch birchCore = new BirchBranch("CORE2");
		oakCore.grow();
		oakCore.grow();
//		oakCore.showAttached("");
		
		GrowingTool growingTool = new GrowingTool();
		
		growingTool.draw(oakCore);
			

		
	}
	
	
	
}