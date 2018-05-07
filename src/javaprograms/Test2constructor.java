package javaprograms;
//constructor chaining
//constructor first line is usually super() calling statement or this() calling statement

public class Test2constructor extends Test1constructor{
	
	Test2constructor(){
		//super();//this would call parent  constructor , this is default even if we dont give super() ,the same parent would be called
		super("NITHYA");
		//super(5);//this would call parent parametrised constructor , this is default even if we dont give super() ,the same parent would be called
		System.out.println("I am from child");
	}
	
	Test2constructor(int a){
		this();//this has no parameter so this would call "i am from child" the above one with no value
		System.out.println("I am from child parametrised");
	}
	
	public static void main(String[] args) {
		Test2constructor obj = new Test2constructor(5);
	}

}
