public class Main
{
  public static void main (String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number ");
    int num = sc.nextInt();
    if(num%2==0){
        System.out.println("The Entered Number is Even");
    }
    
    else{
       System.out.println("The Entered Number is Odd"); 
    }

  }



}
