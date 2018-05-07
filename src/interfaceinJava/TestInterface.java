package interfaceinJava;
/*Can call any number of interface
 * 
 * 
 */

public class TestInterface implements InterfaceExample1,InterfaceExample2{
	
	void iamfromclass() {
		
	}
	
	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	
public static void main(String[] args) {
	//when making ref of interface we cannot call method of same class tats y obj.iamfromclass not appearing
	InterfaceExample1 obj = new TestInterface();
	TestInterface obj2 = new TestInterface();
	obj.test1();
	obj.test2();
	obj.test4();
	obj.test3();
	obj.test5();
	obj2.iamfromclass();
	obj2.test1();
	obj2.test2();
	obj2.test3();
	obj2.test4();
	obj2.test5();
	
	InterfaceExample2 obj3 = new TestInterface();
	//obj3.test6();
		
	}


@Override
public void test6() {
	// TODO Auto-generated method stub
	
}


}
