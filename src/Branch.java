
public interface Branch{
	void attach(Branch branch);
	void grow();
	void showAttached(String prefix);
}
