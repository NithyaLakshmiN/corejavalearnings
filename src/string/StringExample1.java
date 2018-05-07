package string;

public class StringExample1 {
/**
 String is a class.
 String is set of characters
 String is immutable for security reasons
 Two ways to create string
    *with keyword String
    *with new Keyword
    
  String is created using double quotes ---String t1 = "NITHYA"
  String is created in constant pool (Seperate area in heap memmory) 
  when new keyword is used to create string then it is creaedin non constant pool
  object is stored in heap memmory
  object ref is used in static memmory
     *for ex if String t1="NITHYA"
     * t1 would be in Stack and Nithya would be in Heap
     *To make memmory more efficient --objects are not created if it is already present -for ex
     *if String s1 ="NITHYA" and String s2="NITHYA"
     *then in memmory s1 and s2 would point to NITHYA and no new memmory would ce needed or created  
    
    By new Keyword --- String t1 = new String("NITHYA") ==this would be created in non constant pool ie heap Area
     int the baove ex , the value NITHYA would be in String constant pool
 *
 */
	
	public static void main (String[] args) {
		String s1 = "NITHYA";
		String s2 = "NITHYA LAKSHMI";
		String s3 = "NITHYA LAKSHMI NAGARAJAN";
		char [] ch = {'N','I','T','H','Y','A'};
		String s4 = new String(ch);
		char [] ch1 = {'N','I','T','H','1','2'};
		String s5 = new String(ch1);
		String s6 = new String("EXAMPLE");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		String str1="NITHYA";
		String str2 ="LAKSHMI";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		String str4 = str3.concat("NAGARAJAN");
		System.out.println(str4);
		str4 =str4.concat("LONDON");
		System.out.println(str4);
		
		
		String r1 = "NITHYA";
		String r2 ="NITHYA";
		String r3 = new String("LAKSHMI");
		String r4 ="NAGARAJAN";
		
		/*Equals Method compares the original content of the strings*/
		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		System.out.println(r1.equals(r4));
		System.out.println("-----------------------");
		
		/*== compares the reference of the strings*/
		

		String r5 = "NITHYA";
		String r6 ="NITHYA";
		String r7 = new String("NITHYA");
		System.out.println(r5==r6);/*true*/
		System.out.println(r5==r7);/*false*/
		System.out.println(r6==r7);/*false*/
		System.out.println(r6.equals(r7));/*true ,cos content is same*/
		
		
		
		String p1 = "NITHYA";
		String p2 ="nithya";
		System.out.println(p1.equals(p2));//false
		System.out.println(p1.equalsIgnoreCase(p2));//true
		
		
		String p3 = "nithya";
		String p4 ="nithya";
		System.out.println(p3.equals(p4));//true
		System.out.println(p3.equalsIgnoreCase(p4));//true
		
		
		String p5 = "Nithya";
		String p6 ="nithya";
		System.out.println(p5.equals(p6));//false
		System.out.println(p5.equalsIgnoreCase(p6));//true
		
		String p7 = "Nithya";
		String p8 ="Nithya";
		String p9 =new String("LAKSHMI"); //created in non constant pool
		System.out.println(p7==p8);//true
		System.out.println(p7==p9);//false
		System.out.println(p8==p9);//false
		
		//Compare two ASCILL values and give result as below
		   //s1>s2 = positive value
		//s1<s2 = negative value
		//s1==s2 =Zero
		String m1= "NITHYA";
		String m2 = "NITHYA";
		String m3="NAGARAJAN";
		System.out.println(m1.compareTo(m2));//0
		System.out.println(m3.compareTo(m2));//positive value
		System.out.println(m1.compareTo(m3));//negative value
		
		//To get Ascii value
		
		int a = (int)'A';
		System.out.println(+a);
		
		
}
}
