package acessidentifier;

//Private can be accesssed within the same class but private cannot be accessed from different class
//without inheritence when trying to access protected or anything else other than public , it is not possible
//potected can be accessed outside packagae also 
//Default can be access withn package
public class Example1 {
	
	public int a=5;
	protected int b=6;
	private int c=10;
	int d =20;

	public void test1() {
		System.out.println("C test1()");
	}
	
	public void test2() {
		System.out.println("C test1()");
	}
	public void test3() {
		System.out.println("C test1()");
	}
	public void test4() {
		System.out.println("C test1()");
	}
	
	public static void main(String[] args) {
		
		Example1 obj= new Example1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}