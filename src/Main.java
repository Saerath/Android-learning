import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");
		Branch birchSecond = new BirchBranch("BIRCH SECOND");
		
		oakCore.attach(birchSecond);
		oakCore.attach(new OakBranch("Oak 1"));
		oakCore.attach(new BirchBranch("Birch 1"));
		birchSecond.attach(new OakBranch("Oak 2"));
		
		oakCore.getNode();
		
		
		oakCore.showAttached();

	}
	
}