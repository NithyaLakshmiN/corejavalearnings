package testinheritence;

import inheritence.A;

public class TestInherittencefromdifferentpackage extends A{
	
	public static void main(String[] args) {
		
		TestInherittencefromdifferentpackage obj = new TestInherittencefromdifferentpackage();
		obj.test1();
		obj.test2();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
	}

}
