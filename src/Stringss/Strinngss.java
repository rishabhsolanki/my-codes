package Stringss;

import java.util.Scanner;

public class Strinngss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
	
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(str.compareToIgnoreCase(sb.toString())==0)
			System.out.println("pallindrom hai reee");
		else 
			System.out.println("Nahiiiii hai");
		
		
		
	}

}
