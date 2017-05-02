
public class BirchBranch implements Branch {
	
	public void grow(){
		System.out.println("New branch grew");
	}
	
	public static void main(String [ ] args){
		Branch branch = new BirchBranch();
		branch.grow();
	}

}