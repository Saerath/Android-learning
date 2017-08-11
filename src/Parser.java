import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	Pattern p;
	Matcher m;
	
	Map<String, String> opPool = new HashMap<>();


	public void run(String command){
//		String regexp = "^(attach)\\s+(\\S+)\\s+to\\s+(\\S+)$|^(grow)\\s+(\\S+)$";
		String regexp = "^(grow)\\s+(\\S+)$";
		String mainCommand = command;
		
		p = Pattern.compile(regexp);
		m = p.matcher(mainCommand);
		
		System.out.println(mainCommand);
		
		while(m.find()){
			for(int i=0; i<m.groupCount()+1; i++){
				System.out.println(i + ": " + m.group(i).toUpperCase());
			}
					
		}
	}
	
	
}
