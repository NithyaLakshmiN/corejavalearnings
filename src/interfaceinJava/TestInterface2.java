package interfaceinJava;
/*Can call any number of interface
 * 
 * 
 */

public class TestInterface2 implements InterfaceExample3,InterfaceExample4{
	
	int m;
	int h;
	
	public void substarct() {
	System.out.println(j-i);	
	}
	
public void addition() {
	System.out.println(j+i);		
	}

public void multiplication() {
	System.out.println(j*i);
}


@Override
public void sub() {
	// TODO Auto-generated method stub
	
}


@Override
public void sum() {
	// TODO Auto-generated method stub
	
}


@Override
public void multiply() {
	// TODO Auto-generated method stub
	
}

public static void main(String[] args) {
	InterfaceExample3 obj = new TestInterface2();
	obj.sum();
	obj.multiply();
	InterfaceExample4 obj2 = new TestInterface2();
	obj2.sub();
	TestInterface2 obj1 = new TestInterface2();
	obj1.addition();
	obj1.substarct();
	obj1.multiplication();
	
	System.out.println(InterfaceExample3.i);
	System.out.println(InterfaceExample3.j);
	
	System.out.println(InterfaceExample4.k);
}

}
