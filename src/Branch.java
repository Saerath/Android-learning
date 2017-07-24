
public interface Branch{
	void attach(Branch branch);
	abstract void grow();
	void doubleGrow(Branch branch);
	void showAttached();
}
