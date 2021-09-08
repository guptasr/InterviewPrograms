package GoldmanSachs;

/*
 * Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

complexity is log base power of n

i.e log base 3 27 = 3
 */

public class PowerOf {

	public static void main(String args[]) {
		int n = 27;
		int pow = 1;
		while(pow < n) {
			pow = pow * 3;
		}
		
		if(pow == n) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
	}
}
