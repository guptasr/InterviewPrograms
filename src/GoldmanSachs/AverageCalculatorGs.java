package GoldmanSachs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * Given a 2-D String array of student-marks find the student with the highest average and output his average score. If the average is in decimals, floor it down to the nearest integer.
 */

public class AverageCalculatorGs {

	public static void main(String args[]) {
		//String input[][] = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
		String input[][] = {{"Bob","87"}, {"Bob", "52"},{"Bob", "1"}};
		HashMap<String,ArrayList<Integer>> map = new LinkedHashMap<String,ArrayList<Integer>>();
		ArrayList<Integer> temp;
		int sum,avg,max =0;
		String name = null;
		//System.out.println(input.length);
		for(int i = 0; i< input.length;i++) {
			if(map.containsKey(input[i][0])) {
				//System.out.println("inputvalue " +Integer.parseInt(input[i][1]));
				sum = map.get(input[i][0]).get(0) + Integer.parseInt(input[i][1]);
				(map.get(input[i][0])).set(0, sum);
				map.get(input[i][0]).set(1, (map.get(input[i][0]).get(1)+1));
			}else {
				temp = new ArrayList<Integer>();
				temp.add(Integer.parseInt(input[i][1]));
				temp.add(1);
				map.put(input[i][0], temp);
			}
			
		}
		for(Map.Entry<String, ArrayList<Integer>> e: map.entrySet()) {
			avg = e.getValue().get(0)/e.getValue().get(1);
			if(max < avg) {
				max = avg;
				name = e.getKey();
			}
		}
		System.out.println("name = "+name + " avg = "+max);
	}
}
