import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");
		Branch birchSecond = new BirchBranch("BIRCH_1");
		
		oakCore.attach(birchSecond);
		oakCore.attach(new OakBranch("Oak_1"));
		oakCore.attach(new BirchBranch("Birch_1"));
		birchSecond.attach(new OakBranch("Oak_2"));		
		
		oakCore.showAttached("");


	}
	
	
	
}