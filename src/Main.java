import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String [ ] args){
		Branch oakCore = new OakBranch();
		Branch firstBirchBranch = new BirchBranch();
		Branch secondBirchBranch = new BirchBranch();
		Branch thirdOakBranch = new OakBranch();
		
		oakCore.attach(firstBirchBranch);
		oakCore.grow();
		oakCore.grow();

		firstBirchBranch.attach(secondBirchBranch);
		secondBirchBranch.attach(thirdOakBranch);
		thirdOakBranch.grow();
		
		Scanner in = new Scanner(System.in);

		while (true){
			String haha;
			haha = in.next();
			if (haha.equals("end")){
				break;
			} else {
				oakCore.showAttached("--");
			}
		}
	}


}