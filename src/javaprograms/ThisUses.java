package javaprograms;
//when local and global variable same we have to use THIS keyword

public class ThisUses {
	int a;
	int b;
	
	void test1(int a,int b) {
		//here a and b are local variable , any variabe within class or paranthesis is local variable
		this.a=a;
		this.b=b;
		
		
	}
	
	void test2(int p,int H) {
		//when local and global variable are different the no need to use THIS keyword
		a=p;
		b=H;
		
	}
	
	void display() {
		System.out.println("value of a and b is"+a+","+b);
	}
	public static void main(String[] args) {
		ThisUses obj = new ThisUses();
		//obj.test1(4, 5);
		obj.test2(6, 7);
		obj.display();
	}

}
