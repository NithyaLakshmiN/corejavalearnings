package javaprograms;

//This Keyword is sued to refer current class instance variable and this is used to invoke current class constructor
//This will be available for static beacuse all static members are class members
//All non static mebers available for This
public class TestThisKeyword {
	//class variable or global variable or instance varibale
	int a;
	int b;
	int c;
	static int d;
	
	TestThisKeyword(){
		System.out.println("I am from Default Consturctor");
	}
	
    TestThisKeyword(int a,int b){
    	this.a=a;
    	this.b=b;
		
	}
    
    TestThisKeyword(int a,int b,int c){
    	this(a,b);
    	this.c=c;
    	//TestThisKeyword.d;
		
   	}
    
    void display() {
    	System.out.println("The value of a ,b ,c is"+a+","+b+","+c);
    }
    
   
    
    public static void main(String[] args) {
    	TestThisKeyword obj = new TestThisKeyword(2,3,4);
    	obj.display();
	}
	

}
