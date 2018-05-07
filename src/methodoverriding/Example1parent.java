package methodoverriding;

//Whne same method is present in both parent and child class , importance would be given to child class and the child class method would be called first since we are creating object of child class , this is called method overriding 
//Points to Note:-
//1.    Method Overriding is the the feature of java which allow us to create same method in parent 
//and child class with same name and with same arguments.
//2.    Method Overriding is the the ability of java which will make sure method call will happen from a 
//class for which we have created the object. Not from referenced class.
//3.    At compile time method call happens from reference class.
//4.    At Run time method call happens from object class.
//5.    Method Overriding is possible only by inheritance.
//6.    Method Overriding we also call it as run time polymorphism.
//7.    Method Overriding is the the feature of java which allow us to create same method 
//static,private,final methods cannot be over rided
//in parent and child class with same name and with same arguments.
	 //
public class Example1parent {
	
	public void test1() {
		System.out.println("From Parent:test1()");
	}
	
	public void test2() {
		System.out.println("From Parent:test2()");
	}

}
