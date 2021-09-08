package GoldmanSachs;

import java.util.Arrays;

/*
 * 1)	Book Game – A book contains even numbered pages , if you open a page your score will be last digit of a page eg 22 = score 2 , 26 = score 6 , if you get page number ending with 0 or 8 you are out of the game  .
input score=6
6
3,3
2 ,4
1,5
5,1
2,2,2
4,1,1
1,4,1
1,1,4
3,2,1
1,3,2
1,2,3
2,1,3
2,3,1
3,1,2
and so on
Given a score , find the number of ways to get the score .
Constraint- You only have pages till 10.

 */

public class BookGame {
	
	/*public static void main(String args[]) {
		int[] av = {1,2,3,4,5,6,7,9};
		int score = 6;
		for(int i =1 ; i <= n ;i++ ) {
			for()
		}*/
	
	static long countWays(int S[], int m, int n)
    {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)
 
        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];
 
        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)
 
        // Base case (If given value is 0)
        table[0] = 1;
 
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
 
        return table[n];
    }
 
    // Driver Function to test above function
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,9};
        int m = arr.length;
        int n = 6;
        System.out.println(countWays(arr, m, n));
    }
	}
