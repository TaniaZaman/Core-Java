package classText;

public class Class {
	int a;//instance variable
	static int b=20;//static variable
	void m1(int a ) //instance method 
	{
		System.out.println("Instance Method");
	}
	static void m2(String str ) //static method
	{
		System.out.println("static Method");
	}
	Class(){
		System.out.println("0- arg cons");//default cons
		
	}
	Class(int a ){
		System.out.println("1- arg cons");//user defined cons
		
	}
	{
		System.out.println("instance Blocks");//instance blocks
	}
	static {
		System.out.println("static Blocks");//static blocks
	}


	public static void main(String[] args) {
		Class t=new Class();
		Class t1=new Class(10);
		t.m1(10);
		Class.m2("b");

	}

}
