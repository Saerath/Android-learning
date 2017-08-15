package test;

import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");		
		GrowingTool growingTool = new GrowingTool();
		
		growingTool.draw(oakCore);
			
//		Parser parser = new Parser();
//		Branch testBranch = new BirchBranch("TEST");
//		parser.runParser("create oak 3");
//		parser.runParser("asd");
		
	}
	
	
	
}