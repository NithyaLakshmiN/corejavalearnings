package javaprograms;

//Non Static members can be called any number of times and each time it is called the ref 9obj1,obj2..) would be craeted in stack and its values will be stored in heap
//Static members can be called direcly through class and memmory allocation would be done only once and exceution would also be done only once.

public class StaticandNonStatic2 {
	
	int i=10;;
	int j=20;
	static int p=30;
	static int k=40;
	
	public void test1() {
		System.out.println(+p);
	}
	
	
	public void test2() {
		System.out.println(+k);
	}
	
	// in static method non static variables cannot be called,it would throw error
	
	public static void test3() {
		System.out.println(+p);
	}
	
	
	public static void test4() {
		System.out.println(+k);
	}
	
	public static void main(String[] args) {
		
		StaticandNonStatic2 obj = new StaticandNonStatic2();
		obj.test1();
		obj.test2();
		StaticandNonStatic2.test3();
		StaticandNonStatic2.test4();
	}
	
	
	
}
