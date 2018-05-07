package javaprograms;

public class StaticandNonStatic {
	
	int i=10;;
	int j=20;
	static int p=30;
	static int k=40;
	
	public void test1() {
		System.out.println("test1 is non static"+i);
	}
	
	public void test2() {
		System.out.println("test2 is non static"+j);
	}
	
	public static void test3() {
		System.out.println("test3 is static"+p);
	}
	
	public static void test4() {
		System.out.println("test4 is static"+k);
	}
	
	public static void main(String[] args) {
		//for non static members to be called object has to be created
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.test1();
		obj.test2();
		
		//static members can be directly called from class
		StaticandNonStatic.test3();
		StaticandNonStatic.test4();
		
	}

}
