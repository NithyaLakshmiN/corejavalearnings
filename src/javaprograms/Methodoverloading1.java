package javaprograms;

public class Methodoverloading1 {
	
	/**
Method Overloading will allow us to create more than one methods with same name by changing the method arguments.
Method Overloading is called as compile time polymorphisms.
Arguments list can be different in following ways
1) Numbers of parameters to method
2) Data Type of parameters
3) Sequence Type of parameters **/

public void test1() {
      System.out.println("test1()");
	}

	public void test1(int i) {
     System.out.println("test1(int i)");
	}

	public void test1(int i, int j) {
		System.out.println("test1(int i, int j)");
	}

	public void test1(int i, int j, int k) {
		System.out.println("test1(int i, int j, int k)");
	}
	
	public static void main(String[] args) {
		Methodoverloading1 obj = new Methodoverloading1();
		obj.test1();
		obj.test1(7);
		obj.test1(7,8);
		
		obj.test1(7,8,10);
	}

}
	 


