package abstractclass;

public abstract class Abstarctclass {
	/*An Abstract class always has Abstract keyword
	 * This can Abstract methods and non Abstract Methods
	 * it cannot be instantiated mean we cannot create the object of the abstract class and interface
	 * A method that is declared as abstract and does not have the implemented body , then it is abstract method
	 * 
	 * In java ,you cannot create an instance of the abstract class using the new operator,if tried creating it would throw a compile time error,though abstract class can
	 * can have a constructor.
	 * 
	 * Abstract is keyword in java , which is used for both class and methods.Abstract class can contain both the abstract and concrete method.
	 * When	 any one member is written  as abstract then he class becomes abstract class,in normal class we cannot abstract method
	 * An variable cannot be abstract ,only class and methods can be abstract
	 * If an class extends an abstract class or interface it has to provide implementation  to all its abstract method to all its abstract class
	 * By Default the abstract class methods are public
	 */
	
	
	public void test1() {
		System.out.println("I am non abstarct Method");
	}
	
	
	public abstract void test2();
}
		