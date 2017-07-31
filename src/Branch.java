
public interface Branch{

	void attach(Branch branch);
	void grow();
	void showAttached();
	void showAttachedAlternative();
	String getBranchName();
	void setBranchName(String branchName);
	int getNode();

}
