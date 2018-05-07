package programs;

import java.util.Random;

public class Randomnumbergeneration {
	
	public void randomnumbergeneration() {
		Random ran = new Random();
		for(int i=0;i<5;i++) {
			int number =ran.nextInt(200);//print 5 random numbers between 1 and 200 
			System.out.println(+number);
			
		}
	}
	
	public static void main(String[] args) {
		Randomnumbergeneration obj = new Randomnumbergeneration();
		obj.randomnumbergeneration();
		
	}

}
