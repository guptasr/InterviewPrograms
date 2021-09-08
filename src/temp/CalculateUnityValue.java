package temp;

public class CalculateUnityValue {

	public static void main(String args[]) {
		int[] X = {1,5,9,7,3};
		int[] T = {9,7,3,5,1};
		
		int a = Alice(X,T);
		System.out.println(a);
	}
	
	public static int Alice(int[] x, int[] t) {
		int count=0;
		for(int i =0 ;i< x.length;i++) {
			if(x[i]!=t[i]) {
				count ++;
			}
		}
		return count;
	}
}
