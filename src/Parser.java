import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	Pattern p;
	Matcher m;


	void run(){
		String regexp = "^(attach)\\s+(\\S+)\\s+to\\s+(\\S+)$|^(grow)\\s+(\\S+)$";
		String mainCommand = "attach oak11 to birch22 and grow core";
		
		p = Pattern.compile(regexp);
		m = p.matcher(mainCommand);
		
		System.out.println(mainCommand);
		
		while(m.find()){
			for(int i=0; i<m.groupCount()+1; i++){
				System.out.println(i + ": " + m.group(i));
			}
					
		}
	}
	
	
}
