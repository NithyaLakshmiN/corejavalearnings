package javaprograms;
//statis members are class members
//Non static members are object members


public class testthisinJava {
	
	int a;
	int b;
	int c;
	static int d;
	
	
	 void test1() {
		 this.test2();//calling non static members
	    	System.out.println("I am from test1");
	    }
	    
	    void test2() {
	    	
	    	System.out.println("I am from test2");
	    }
	    
	    static void test3(int a) {
	    	//this wont be available for static
	    	//this.===no method would appear
	    	System.out.println("I am from test3");
	    }
	    
	    
	    void test4(testthisinJava obj) {
	    	System.out.println("Method is Invoked");
	    	System.out.println(obj.getClass().getName());
}
	    void test5() {
	    	test4(this);
	    	test3(9);
	    	
	    }
	    
	    public static void main(String[] args) {
	    	//TestThisKeyword obj = new TestThisKeyword();
	    	testthisinJava obj1 = new testthisinJava();
	    	obj1.test5();
		}
}
