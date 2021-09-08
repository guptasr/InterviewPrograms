package GoldmanSachs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Given a string, find its first non-repeating character
 * GeeksforGeeks”, then the output should be ‘f’ and if the input string is “GeeksQuiz”, then the output should be ‘G’. 
 */

public class StringRepeatation {
	
	public static void main(String args[]) {
		String in = "GeeksQuiz";//"GeeksforGeeks";
		HashMap<Character,Integer> c = new LinkedHashMap<Character,Integer>();
		for(int i = 0 ;i < in.length(); i++ ) {
			if(c.containsKey(in.charAt(i))) {
				c.put(in.charAt(i), c.get(in.charAt(i))+1);
			}else {
				c.put(in.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> e: c.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
