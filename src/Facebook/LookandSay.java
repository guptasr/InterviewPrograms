package Facebook;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * Implement a function that outputs the Look and Say sequence:
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
 */

public class LookandSay {
	public static void main(String args[]) {
		String a ;
		String b = "1";
		char temp;
		int count=0;
		for(int i=0 ; i < 10; i++) {
			System.out.println(b);
			a= b+" ";
			b="";
			count = 0;
			temp = a.charAt(0);
			for(int j=0;j<a.length();j++) {
				if(temp == a.charAt(j)) {
					count++;
				}else {
					b += Integer.toString(count);
					b += temp;
					temp = a.charAt(j);
					count = 0;
					j--;
				}
			}
		}
	}
}
