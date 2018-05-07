package javaprograms;
//We always create an object for constructor we never create object of class.
//constructor is used to create an object
//Java compiler default will keep one default constructor
//Through Parametrised constryuctor we can intialise global variable
//constructor is used to supplu different data to the object
//When local variable and instance varibale value is same , we can use THIS keyword to intialise instance varaible as local variable eg -this.a=a as shown below
//we cannot create two default constructor ,it will give compile error
//we cannot crete two parametriased with same argument , but can be created with different argument
public class TestConstructor {
	int a;//instance Variable
	int b;
	
	//createing default constructor
	public TestConstructor() {
		System.out.println("I am from Dafult Constructor");
	}
	
	
	//Creating parametrized constructor
	TestConstructor(int a){
		this.a=a;
		System.out.println("I am from Parametrized Constructor and integer");
	}
	
	TestConstructor(String a){
		
		System.out.println("I am from Parametrized Constructor and String Constructor");
	}
	
	TestConstructor(int a,int b){
		this.a=a;//mapping global varibale with local variable
		this.b=b;
		System.out.println("I am from Parametrized Constructor");
	}
	
	TestConstructor(int a,String b){
		this.a=a;//mapping global varibale with local variable
		//this.b=b;
		System.out.println("I am from Parametrized Constructor");
	}
	
	void sum() {
		int c= a+b;
		System.out.println("The sum of a and b is "+c);	
	}
	
	void display() {
		System.out.println("The value of a is "+a);	
	}
	

	public static void main(String[] args) {
		TestConstructor obj = new TestConstructor();
		TestConstructor obj3 = new TestConstructor("BHANU");
		obj.display();//by default when variable not intialisd so o/p displays as Zero
		TestConstructor obj1 = new TestConstructor(5);
		obj1.display();
		obj.sum();
		TestConstructor obj2 = new TestConstructor(5,10);
		obj2.sum();
	}

}
