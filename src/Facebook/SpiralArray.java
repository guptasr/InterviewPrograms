package Facebook;

import java.util.Arrays;

/*
 * Find the pattern and complete the function:
int[][] spiral(int n);
where n is the size of the 2D array.

Sample Result

input = 3
123
894
765

input = 4
01 02 03 04
12 13 14 05
11 16 15 06
10 09 08 07

input = 8
1 2 3 4 5 6 7 8
28 29 30 31 32 33 34 9
27 48 49 50 51 52 35 10
26 47 60 61 62 53 36 11
25 46 59 64 63 54 37 12
24 45 58 57 56 55 38 13
23 44 43 42 41 40 39 14
22 21 20 19 18 17 16 15
 */

public class SpiralArray {

	public static void main(String args[]) {
		int[][] a = spiral(8);
		
		for(int i=0 ;i< a.length ; i++) {
			for(int j=0 ; j< a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] spiral(int n){
		int[][] a = new int[n][n];
		int r=0,c=0,num=1,limit=n*n,dir = 0;
		int[] dr = {0,1,0,-1};
		int[] dc = {1,0,-1,0};
		
		while(num <= limit) {
			a[r][c] = num;
			r += dr[dir];
			c += dc[dir];
			if(isValid(a,r,c)) {
				r -= dr[dir];
				c -= dc[dir];
				dir = (dir+1)%4;
				r += dr[dir];
				c += dc[dir];
			}
			num++;
		}
		return a;
	}
	
	public static boolean isValid(int[][] a,int r,int c) {
		return r < 0 || c < 0 || r >= a.length || c >= a.length || a[r][c] != 0;
	}
}
