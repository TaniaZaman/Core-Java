package methodTypes;
//Example no 1
 class Methods {
	 
	 Methods m1() {//Class type method
		 System.out.println("m1 method");// 
		 Methods m = new Methods();
		 return m;
	 }
	 Methods m2() {
		 System.out.println("m2 method");
		 return this;//this reference this class value
	 }
	 
	 
	 public static void main(String[] args) {
		 Methods t = new Methods();
		 Methods t1= t.m1();//object return class type value
		 Methods t2= t.m2();
	}

}
 //Example no 2
/* public class Test {
		int a=100; //Instance variable;
		int m1(int a) {
			System.out.println("m1 method");
			return a;
		}
		public static void main(String[] args) {
			Test t = new Test();
			int t2 = t.m1(10);
			System.out.println("Return type value = " + t2 );
		}

	}*/
 
// Example no 3 -
/* public class Test {
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

	}*/

//Example no 4-
/* public class Test {
		int a=100; //Instance variable;
		int m1(int a) {
			System.out.println("m1 method");
			return this.a;//return Instance variable
		}
		public static void main(String[] args) {
			Test t = new Test();
			int t2 = t.m1(10);
			System.out.println("Return type value = " + t2 );
		}

	}
*/