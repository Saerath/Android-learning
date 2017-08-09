
public class Singleton {
	
	private int nodeNum = 0;
	
	public int getNodeNum() {
		return nodeNum;
	}

	public void addNodeNum() {
		nodeNum++;
	}

	static Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		return singleton;
	}
	
	
}
