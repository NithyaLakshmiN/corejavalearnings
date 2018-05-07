package abstractclass;

public class TestAbstractclass extends Abstarctclass{
	
	@Override
	public void test2() {
		
	}
	public static void main(String[] args) {
		TestAbstractclass obj = new TestAbstractclass();
		obj.test1();
		obj.test2();
		
		Abstarctclass obj2 = new TestAbstractclass();
		obj2.test1();
		obj2.test2();
	}
	
}
