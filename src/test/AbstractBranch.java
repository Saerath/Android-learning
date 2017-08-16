package test;
import java.util.*;

public abstract class AbstractBranch implements Branch {

	public final int node;
	
	boolean attached;
	
	private String branchName;
	
	Singleton singleton = Singleton.getInstance();
	
	ArrayList<Branch> attachedBranches = new ArrayList<>();
	
	//---------------------------------
	
	public abstract void grow();
	public abstract int getNode();
	public abstract String getBranchPrefix();
	
	//---------------------------------
	
	/*
	 * branchName get/set
	 */

	
	@Override
	public String getBranchName() {
		return branchName;
	}

	@Override
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	//--------------------------------
	
	/*
	 * AbstractBranch constructor
	 */
	
	public AbstractBranch(String branchName) {
		this.branchName = branchName;
		this.node = singleton.getNodeNum();
		singleton.addNodeNum();
		singleton.addToBranchMap(branchName, this);
	}
	
	public AbstractBranch() {
		this.node = singleton.getNodeNum();
		this.branchName = this.getClass().getSimpleName() + " " + this.node; 
		singleton.addNodeNum();
		singleton.addToBranchMap(branchName, this);
	}
	
	//---------------------------------
	
	
	public ArrayList<Branch> getBranches(){
		return attachedBranches;
	}
	
	@Override
	public void attach(Branch branch){
		attachedBranches.add(branch);
		branch.setAttached(true);
	}
	
	
	//---------------------------------
//	@Override
//	public void showAttached(String prefix){
//	
//		if(this.getNode()==0){
//			System.out.println(this.getBranchName() + " \"" + this.getClass().getSimpleName() + "\"" + " Attached?: " + this.isAttached());
//		}
//			for(Branch a : attachedBranches){
//				System.out.println(prefix + a.getBranchPrefix() + " " + a.getBranchName() + " \"" + a.getClass().getSimpleName() + "\"" + " Attached?: " + a.isAttached());
//				a.showAttached(prefix+a.getBranchPrefix());	
//			}
//		
//	}
	
	@Override
	public void showAttached(String prefix){
		
		System.out.println(prefix + " " + this.getBranchName() + " \"" + this.getClass().getSimpleName() + "\"" + " Attached?: " + this.isAttached());
	
		for(Branch a:attachedBranches){
			a.showAttached(prefix + a.getBranchPrefix());
		}
		
	}

	
	@Override
	public boolean isAttached(){
		return this.attached;
	}
	
	@Override
	public void setAttached(boolean attached){
		this.attached = attached;
	}

}