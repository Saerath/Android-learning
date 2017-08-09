import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");		
		GrowingTool growingTool = new GrowingTool();
		
		oakCore.grow();
		oakCore.grow();
		oakCore.attach(new BirchBranch("HAHA"));
		
		oakCore.showAttached("");
		
		growingTool.growBranch(oakCore);

	}
	
	
	
}