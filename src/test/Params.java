package test;
//builder from https://habrahabr.ru/post/244521/


public class Params {
	private String commandName;
	private String branchNameOne;
	private String branchNameTwo;
	
	public Params() {
		// TODO Auto-generated constructor stub

	}
	
	public String getCommandName() {
		return commandName;
	}

	public String getBranchNameOne() {
		return branchNameOne;
	}

	public String getBranchNameTwo() {
		return branchNameTwo;
	}
	
	public static Builder newBuilder(){
		return new Params().new Builder();
	}

	
	public class Builder {
		
		private Builder(){
			
		}
		
		public Builder setCommandName(String commandName) {
			Params.this.commandName = commandName.toUpperCase();
			return this;
		}
		
		public Builder setBranchNameOne(String branchNameOne) {
			Params.this.branchNameOne = branchNameOne.toUpperCase();
			return this;
		}
		
		public Builder setBranchNameTwo(String branchNameTwo) {
			Params.this.branchNameTwo = branchNameTwo.toUpperCase();
			return this;
		}
		
		public Params build(){
			return Params.this;
		}
		
	}

}
