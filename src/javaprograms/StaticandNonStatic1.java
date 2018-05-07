package javaprograms;

//Non Static members can be called any number of times and each time it is called the ref 9obj1,obj2..) would be craeted in stack and its values will be stored in heap
//Static members can be called direcly through class and memmory allocation would be done only once and exceution would also be done only once.

public class StaticandNonStatic1 {
	
	int i=10;;
	int j=20;
	static int p=30;
	static int k=40;
	
	public static void main(String[] args) {
		//for non static members to be called object has to be created
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.test1();
		obj.test2();
		
		StaticandNonStatic obj1 = new StaticandNonStatic();
		obj1.test1();
		obj1.test2();
		
		StaticandNonStatic obj2 = new StaticandNonStatic();
		obj2.test1();
		obj2.test2();
		
		//static members can be directly called from class
		StaticandNonStatic.test3();
		StaticandNonStatic.test4();
		
		StaticandNonStatic.test3();
		StaticandNonStatic.test4();
		
		StaticandNonStatic.test3();
		StaticandNonStatic.test4();
		
		StaticandNonStatic.test3();
		StaticandNonStatic.test4();
		
	}

}
