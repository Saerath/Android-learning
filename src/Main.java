import java.io.IOException;

public class Main {

	public static void main(String [ ] args) throws IOException{
		Branch oakCore = new OakBranch("CORE");
		Branch birchSecond = new BirchBranch("BIRCH_SECOND");
		Branch birchThird = new BirchBranch("BIRCH_THIRD");
		Branch birchFourth = new BirchBranch("BIRCH_FOURTH");
		
		oakCore.attach(birchSecond);
		oakCore.attach(new OakBranch("Oak_1"));
		oakCore.attach(new BirchBranch("Birch_1"));
		birchSecond.attach(birchThird);		
		birchThird.attach(birchFourth);
		birchFourth.attach(new OakBranch());

		oakCore.showAttached("");
		System.out.println();
		
		oakCore.grow();
		
		oakCore.showAttached("");

	}
	
	
	
}