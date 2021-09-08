package GoldmanSachs;

import java.util.ArrayList;
import java.util.Collections;

/*
 * There is a grid [[1,3,4,5], <-end Point
...................[1,3,2,2],
start point------->[0,6,9,9]]
You have to reach from start point to end point collecting the max number of rocks.value of each grid element is representing the number of coins you can collect while on that grid position. You can move up and right.(recursion was accepted)
 */

public class GridProblem {

	public static ArrayList<Integer> a=new ArrayList<Integer>();
	public static int count =1;
	public static void main(String args[]) {
		Integer[][] grid = {{1,3,4,5},
							{1,3,2,2},
							{0,6,9,9}};
		
		move(grid,2,0,0);
		System.out.println(Collections.max(a));
		System.out.println(count);
	}
	
	public static void move(Integer[][] grid,int i, int j, int sum) {
		if(i==0 && j == grid[0].length-1) {
			a.add(sum);
			return;
		}
		if(i!=0) {
			move(grid,i-1,j,sum+grid[i-1][j]);
			count++;
		}
	    if(j != grid[0].length-1) {
			move(grid,i,j+1,sum+grid[i][j+1]);
			count++;
		}
		return;
	}
}
