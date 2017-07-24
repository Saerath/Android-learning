
public interface Branch{
	void attach(Branch branch);
	abstract void grow();
	void showAttached();
}
