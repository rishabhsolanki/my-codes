package Stringss;
import java.util.*;
public class FirstNonRepeatingCharByMap {
	//Using Linked Hash Map bcoz  it preserve insertion Order and no duplicate value 
	public  static Character  nonRepeatingCharFunction(String str) {
		Map<Character ,Integer>map = new LinkedHashMap<>();
		Integer temp ;
		Character ch;
		for(int i=0 ;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				temp=map.get(str.charAt(i));
				map.put(str.charAt(i), temp+1);
				
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			ch =entry.getKey();
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
				return ch;
				
			}
		}
		return ' ';
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		System.out.println(nonRepeatingCharFunction(str));
		
	}

}
