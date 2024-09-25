package Stringss;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram3 {
	public static boolean isAnagram(String s1,String s2) {
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
	
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(isAnagram(s1,s2))
			System.out.println("Anagram hai "+s1+" "+s2);
		else
			System.out.println("NAhi hai anagram "+s1+" "+s2);
	}

}
