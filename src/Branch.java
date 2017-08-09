
public interface Branch{

	void attach(Branch branch);
	void grow();
	void showAttached(String prefix);
	String getBranchName();
	String getBranchPrefix();
	void setBranchName(String branchName);
	int getNode();
	Branch getBranchFromMap(String attachebleBranch);
	

}
