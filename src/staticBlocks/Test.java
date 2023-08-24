package staticBlocks;

public class Test {
	 
	static {
		System.out.println("Static Blocks-a");
	}
	public static void main(String[] args) throws ClassNotFoundException  {
		Class.forName("B");
		Class.forName("C");
	}
    
	
	
}
