
public class Params {
	private String commandName;
	private String branchName1;
	private String branchName2;
	
	public Params(String commandName, String branchName1, String branchName2) {
		// TODO Auto-generated constructor stub
		this.commandName = commandName;
		this.branchName1 = branchName1;
		this.branchName2 = branchName2;
	}
	
	public String getCommandName() {
		return commandName;
	}
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}
	public String getBranch1() {
		return branchName1;
	}
	public void setBranch1(String branch1) {
		this.branchName1 = branch1;
	}
	public String getBranch2() {
		return branchName2;
	}
	public void setBranch2(String branch2) {
		this.branchName2 = branch2;
	}

}
