package inheritence;

//private members cannot be inherited
//only non static mebmbers can be inherited

public class A {
	
	public int a=10;
	protected int b=20;
	private int c=30;
	int d=40;

	public void test1() {
		System.out.println("I am from test1()");
	}
	
   protected void test2() {
	   System.out.println("I am from test2()");	
	}

   private void test3() {
	   System.out.println("I am from test3()");	
	
}
   
   
   //Default
   void test4() {
	   System.out.println("I am from test3()");	

}
}
