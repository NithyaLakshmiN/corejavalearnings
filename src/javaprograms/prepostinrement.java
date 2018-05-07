package javaprograms;
//pre means === First Increment the value and then use it
//Post means===First use the value and then increment

public class prepostinrement {
	
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		int a =2;
		
		int k = --a;
		int l = a--;
		
		System.out.println(i);//0
		System.out.println(j);//0
		
		System.out.println(++i);//First increment the value of i and then print//1
		System.out.println(++j);//First increment the value of j and then print//1
		
		System.out.println(i);//1
		System.out.println(j);//1
		
		System.out.println(i++);//First use the value of i and then increment//1
		System.out.println(j++);//First use the value of j and then increment//1
		
		System.out.println(i);//1
		System.out.println(j);//1
		
		System.out.println(i++);//First use the value of i and then increment//2
		System.out.println(j++);//First use the value of j and then increment//2
		
		System.out.println(i);//3
		System.out.println(j);//3
		
		
		System.out.println(++i);//First increment the value of i and then print//4
		System.out.println(++j);//First increment the value of j and then print//4
		
		System.out.println(i);//4
		System.out.println(j);//4
		
		System.out.println(i++);//First increment the value of i and then print//4
		System.out.println(j++);//First increment the value of j and then print//4
		
		System.out.println(i);//5
		System.out.println(j);//5
		
		System.out.println(++i);//First increment the value of i and then print//6
		System.out.println(++j);//First increment the value of j and then print//6
		
		System.out.println(i);//6
		System.out.println(j);//6
		
		System.out.println(i++);//First increment the value of i and then print//6
		System.out.println(j++);//First increment the value of j and then print//6
		
		System.out.println(i);//7
		System.out.println(j);//7
		
		System.out.println(++i);//First increment the value of i and then print//8
		System.out.println(++j);//First increment the value of j and then print//8
		
		System.out.println(i);//8
		System.out.println(j);//8
		
		System.out.println(k);//1
		System.out.println(l);//1
		
	}

}
