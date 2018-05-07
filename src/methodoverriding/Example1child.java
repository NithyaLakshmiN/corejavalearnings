package methodoverriding;

public class Example1child extends Example1parent {
	
	public void test1() {
		System.out.println("From child:test1()");
	}
	
	public static void main (String[] args) {
		Example1parent obj= new Example1parent();
		obj.test1();
		obj.test2();
		
	}

}
