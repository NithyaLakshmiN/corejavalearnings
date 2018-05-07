package programs;
import java.util.Scanner;
public class Reversenumber {
	public static void main(String[] args) {
		int rev=0;
		
		System.out.print("Enter a Number : ");
		 Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
			
			while(n!=0) {
				int m=n%10;
				n=n/10;
				rev = rev*10+m;
			}
			System.out.print("Reverse = " +rev);
		}
	}
		
	



