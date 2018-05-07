package programs;

import java.util.*;

public class DuplicateString {
	
	public static void main (String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    char[] chars = str.toCharArray();
    
    Map <Character ,Integer> charMap = new  HashMap<Character ,Integer>();
    
    for(Character ch:chars) {
    	if(charMap.containsKey(ch)) {
    		charMap.put(ch, charMap.get(ch)+1);
    		
    	}
    	
    	else {
    		charMap.put(ch,1);
    	}
    	
    }
    
    Set<Character> Keys =charMap.keySet();
    for(Character ch:Keys) {
    	if(charMap.get(ch)>1) {
    		System.out.println(ch+"---->"+charMap.get(ch));
    	}
    	
    	else {
    		System.out.println(ch+"---->"+charMap.get(ch));
    	}
		
	}
	}

}

