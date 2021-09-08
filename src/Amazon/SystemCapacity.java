package Amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * You have given two array one containing startJobs and one containing endJobs with their durations.In addition to that their is 
 * also a system Capacity which is given.
 * you have to find the pair of start and end job which is equal to system capacity. 
 */
public class SystemCapacity {

	public static void main(String[] args) {
		Integer[][] startJob = {{0,20},{1,234},{2,60},{3,57}};
		Integer[][] endJob = {{0,100}};
		int capacity = 200;
		
		String a = "bags";
		System.out.println(a.substring(0, 4));
		
		List<String> ab = new LinkedList<String>();
		List<List<String>> abc = new LinkedList<List<String>>();
		List<List<String>> bc = new ArrayList<>();
		
		ab.add("ram");
		bc.add(ab);
		abc.add(bc.get(0));
		System.out.println(abc);
		ab.clear();
		ab.add("shaya");
		bc.add(ab);
		abc.add(bc.get(0));
		System.out.println(bc);
		
	}
}
