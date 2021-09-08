package Facebook;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinLenSubstring {
	


	  int minLengthSubstring(String s, String t) {
		  // Write your code here
		    int min = Integer.MAX_VALUE;
		    int max = 0;
		    
		    if(s.length() < t.length()){
		      return -1;
		    }else if(s.length() >= t.length()){
		      Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		      for(char a: t.toCharArray()){
		        if(s.contains(String.valueOf(a))){
		          if(map.containsKey(a)){
		            if(s.indexOf(a,map.get(a)+1) == -1){
		              return -1;
		            }else{
		              map.put(a,s.indexOf(a,map.get(a)+1));
		            }
		          }else{
		            map.put(a,s.indexOf(a));
		          }
		        }else{
		          return -1;
		        }
		      }
		      
		      for(Map.Entry e : map.entrySet()){
		        if((int)e.getValue() < min){
		          min = (int)e.getValue();
		        }
		        if((int)e.getValue() > max){
		          max = (int)e.getValue();
		        }
		      }
		      max++;
		    return (max-min);
		    }
		    return (max-min);
		  }










	  // These are the tests we use to determine if the solution is correct.
	  // You can add your own at the bottom.
	  int test_case_number = 1;
	  void check(int expected, int output) {
	    boolean result = (expected == output);
	    char rightTick = '\u2713';
	    char wrongTick = '\u2717';
	    if (result) {
	      System.out.println(rightTick + " Test #" + test_case_number);
	    }
	    else {
	      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
	      printInteger(expected); 
	      System.out.print(" Your output: ");
	      printInteger(output);
	      System.out.println();
	    }
	    test_case_number++;
	  }
	  void printInteger(int n) {
	    System.out.print("[" + n + "]");
	  }
	  public void run() throws IOException {
	    String s_1 = "dcbefebce";
	    String t_1 = "fd";
	    int expected_1 = 5;
	    int output_1 = minLengthSubstring(s_1, t_1);
	    check(expected_1, output_1);

	    String s_2 = "bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf";
	    String t_2 = "cbccfafebccdccebdd";
	    int expected_2 = -1;
	    int output_2 = minLengthSubstring(s_2, t_2);
	    check(expected_2, output_2);

	    // Add your own test cases here
	    
	  }
	  public static void main(String[] args) throws IOException {
	    new MinLenSubstring().run();
	  }
}
