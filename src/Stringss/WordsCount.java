package Stringss;

import java.util.*;
import java.util.Map.Entry;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test for the skill test in a test form";
		String as [] = s.split("\\W+");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word : as) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		for(Entry<String, Integer> entry :map.entrySet()) {
			System.out.println(entry.getKey()+":"+ entry.getValue());
			
		}
				

	}

}
