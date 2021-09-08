package Facebook;

/*
 * Given a Binary Tree. calculate the avg of each level of the tree.
 * 
 *      4
 *     / \
 *    7   9
 *   / \   \
 *  10 2    6
 *  
 *  O/p: [4,8,6]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BFS {
	public static class Node{	
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public static HashMap<Integer,ArrayList<Integer>> map = new LinkedHashMap<Integer,ArrayList<Integer>>();
	
	public static void calculate(Node n, int dept) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		if(map.containsKey(dept)) {
			a.add(0,n.data+map.get(dept).get(0));
			a.add(1,map.get(dept).get(1)+1);
		}else {
			a.add(0,n.data);
			a.add(1,1);
		}
		map.put(dept,a);
		
		if(n.left != null ) {
			calculate(n.left, dept+1);
		}
		if(n.right != null) {
			calculate(n.right, dept+1);
		}
		
		return;	
	}
	
	public static void main(String args[]) {
		Node start = new Node(4);
		start.left = new Node(7);
		start.right = new Node(9);
		start.left.left = new Node(10);
		start.left.right = new Node(2);
		start.right.right = new Node(6);
		
		calculate(start, 0);
		
		for(Map.Entry<Integer,ArrayList<Integer>> m : map.entrySet()) {
			System.out.println("dept ="+m.getKey() + " avg = "+ m.getValue().get(0)/m.getValue().get(1));
			
		}
	}
}
