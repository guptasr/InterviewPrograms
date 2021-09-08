package temp;

public class Reverse {

	public static void main(String args[]) {
		String a, reverse="";
		
		a = "abc";
		
		for(int i=a.length()-1; i >= 0 ;i--){
			reverse += a.charAt(i);
		}
		System.out.println(" string = " + reverse);
	}
}
