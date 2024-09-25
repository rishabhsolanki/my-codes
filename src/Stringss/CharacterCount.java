package Stringss;

import java.util.Scanner;
import java.util.*;

public class CharacterCount {
	public static void CharacterCountMethod(String s1) {
		 char[] c = s1.toCharArray();
		 HashMap<Character,Integer> map = new HashMap<>();
		 for(int i=0;i<c.length;i++) {
			 if(map.containsKey(c[i])) {
				Integer a= map.get(c[i]);
				map.put(c[i], a+1);				 
			 }else
				 map.put(c[i], 1);	 
		 }
		// System.out.println(map);
		 for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			    System.out.print(entry.getKey()+""+entry.getValue());
			}
		 
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		CharacterCountMethod(s1);
		
	}

}
