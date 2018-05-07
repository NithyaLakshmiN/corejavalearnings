//to beautify code ctrlA ,ctrl+shift+f

package javaprograms;

public class Methodoverloading2 {

	/**
	 * Method Overloading will allow us to create more than one methods with same
	 * name by changing the method arguments. Method Overloading is called as
	 * compile time polymorphisms. Arguments list can be different in following ways
	 * 1) Numbers of parameters to method 2) Data Type of parameters 3) Sequence
	 * Type of parameters
	 * Method overloading cannot be done with difffernt return types
	 * Final method can be overloaded
	 * *static methods can be overloaded
	 **/

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
	
	public void test1(double i) {
		System.out.println("test1(int i)");
	}
	
	public void test1(double i, double j) {
		System.out.println("test1(double i, double j)");
	}
	
	public static void main(String[] args) {
		Methodoverloading2 obj = new Methodoverloading2();
		obj.test1(9.8, 9.0);
		obj.test1(9, 9);
	}

}