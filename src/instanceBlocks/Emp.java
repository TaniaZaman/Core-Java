package instanceBlocks;

public class Emp {
	
	
	int eid; //0 printing
	//instance blocks initializing value to the variable during object creation;
	{
		eid= 111;
	}
	
	void disp() {
		System.out.println(eid);
	}

	public static void main(String[] args) {
		
		new Emp().disp();
	
		
	}

}
