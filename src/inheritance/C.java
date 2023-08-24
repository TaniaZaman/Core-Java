package inheritance;

public class C extends A {
	
	C() {this(10);
	
	
		System.out.println("Child o arg cons");
	}
	C(int a) {super();  
		System.out.println("Child-1 arg cons");
	}
	
	public static void main(String[] args) {
	new C();  

	
	}
}
