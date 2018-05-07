package programs;

public class PrintDistinctElementinArray {
	
	public static void main (String[] args) {
		int i,j;
		int [] A = {1,2,3,5,7,8,9,9,2,3};
	
		
		for (i=0;i<A.length;i++) {
			for (j=0;j<i;j++) {
				if(A[i]==A[j]){
					break;
				}
			}
			if(i==j) {
				System.out.println(A[j]);
				
			}
			
		}
		
		
	}
}


