package Stringss;

/*package whatever //do not write package name here */
import java.util.*;

class FirstNonRepeatingCharacterInString {

// Function which repeats
// first Nonrepeating character
public static void FirstNonRepeat(String s)
{

	for (int i = 0; i < s.length(); i++) {
		
	//	System.out.println(s.charAt(i));
	//	System.out.println(s.indexOf(s.charAt(i)));
	//	System.out.println(s.indexOf(s.charAt(i),s.indexOf(s.charAt(i))+1));
	if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
		
		System.out.println("First non-repeating character is "+ s.charAt(i));
		break;
	}
	}
	return;
}
public static void main (String[] args) {
	String s = "Rishoajbh Raj solanbkil";
	FirstNonRepeat(s);
}
}


