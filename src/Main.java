import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");
		Branch birchSecond = new BirchBranch("BIRCH_SECOND");
		
		GrowingTool growingTool = new GrowingTool();
		
		growingTool.draw(oakCore);

	}
	
	
	
}