package Stringss;

import java.util.Scanner;

public class AnagramString {
	public  static boolean isAnagram(String s1 , String s2) {
		if(s1.length()==s2.length())
		{
		int count [] = new int[256];
		
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;	
			count[s2.charAt(i)]--;
		}
		
		for(int j=0;j<count.length;j++) {
			if(count[j]!=0)
				return false;				
		}
		return true;
		}
		else 
			return false;			
		
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
