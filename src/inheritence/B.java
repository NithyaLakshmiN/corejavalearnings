package inheritence;

public class B extends A{

	public static void main(String[] args) {
		
		B obj = new B();
		A obj1= new A();
		obj.test1();
		obj.test2();
		obj.test4();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);
		System.out.println(obj.d);
		
		
		
	}

}
