
public interface Branch{

	void attach(Branch branch);
	void grow();
	void showAttached();
	String getBranchName();
	void setBranchName(String branchName);

}
