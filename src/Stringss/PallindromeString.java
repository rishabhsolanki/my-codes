package Stringss;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
	
		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
//		if(str.compareToIgnoreCase(sb.toString())==0)
//			System.out.println("pallindrom hai reee");
//		else 
//			System.out.println("Nahiiiii hai");
		
		for(int i=0;i<sb.length()/2;i++) {
			int front =i;
			int back =sb.length()-1-i;
			 char frontchar = sb.charAt(front);
			 char backchar = sb.charAt(back);
			sb.setCharAt(front,backchar);
			sb.setCharAt(back,frontchar);
			System.out.println(sb);
		}
		System.out.println(sb);
		if(str.compareTo(sb.toString())==0)
			System.out.println("pallindrom hai reee   " +sb);
		else 
			System.out.println("Nahiiiii hai");
		
		//System.out.println(sb);
		
	}

}
