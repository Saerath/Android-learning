import java.io.IOException;

public interface Branch{

	void attach(Branch branch);
	void grow();
	void showAttached(String prefix);
	void growingCore() throws IOException;
	String getBranchGen();
	String getBranchPrefix();

}
