package Stringss;

import java.util.Scanner;

public class ReverseStatement {



    //Function to reverse words in a given string.
     static String reverseWords(String S)
    {
        // code here
        //ArrayList<String> str = new ArrayList<>();
        String [] str = S.split("[.]"); 
        String s1=str[str.length-1];
        for(int i =str.length-2;i>=0;i--){
            s1=s1+"."+str[i];
          //  System.out.println(str[i]+".");
        }
        return s1;
    }
    public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(reverseWords(s1));
		
	}
}