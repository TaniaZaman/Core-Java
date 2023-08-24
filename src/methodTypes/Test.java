package methodTypes;

public class Test {
	int a=100; //Instance variable;
	int m1() {
		System.out.println("m1 method");
		return a;//return Instance variable
	}
	public static void main(String[] args) {
		Test t = new Test();
		int t2 = t.m1();
		System.out.println("Return type value = " + t2 );
	}

}
