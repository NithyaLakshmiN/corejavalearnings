package javaprograms;

public class Classandobject1 {
	public int height =165;
	public int weight =63;
	public int i;
	
	public void nithya() {
		System.out.println("This is a Method");
	}
	
	public void nithya1(int i) {
		System.out.println(+i);
	}
	
	public static void main(String[] args) {
		Classandobject1 obj= new Classandobject1();
		obj.nithya();
		obj.nithya1(30);
		
		System.out.println("Nithya's Height is" +obj.height);
		System.out.println("Nithya's weight is" +obj.weight);
		
	}

}
