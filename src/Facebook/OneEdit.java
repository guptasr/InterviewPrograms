package Facebook;

/*
 * Write a function that returns whether two words are exactly "one edit" away using the following signature:
bool OneEditApart(string s1, string s2);
An edit is:
Inserting one character anywhere in the word (including at the beginning and end)
Removing one character
Replacing one character
Examples:
OneEditApart("cat", "dog") = false
OneEditApart("cat", "cats") = true
OneEditApart("cat", "cut") = true
OneEditApart("cat", "cast") = true
OneEditApart("cat", "at") = true
OneEditApart("cat", "act") = false
 */

public class OneEdit {
	
	public static void main(String aregs[]) {
				System.out.println(OneEditApart("cat", "dog"));
				System.out.println(OneEditApart("cat", "cats"));
				System.out.println(OneEditApart("cat", "cut"));
				System.out.println(OneEditApart("cat", "cast"));
				System.out.println(OneEditApart("cat", "at"));
				System.out.println(OneEditApart("cat", "act"));
	}
	
	public static boolean OneEditApart(String s1, String s2) {
		char[] a,b; 
		int count=0;
		int i=0,j=0;
		if(s1.equals(s2)) {
			return true;
		}else if(s1.length() == s2.length() || s1.length() == s2.length()-1 || s2.length() == s1.length()-1) {
			if(s1.length() < s2.length()) {
				a=s1.toCharArray();
				b=s2.toCharArray();
			}else {
				b=s1.toCharArray();
				a=s2.toCharArray();
			}
			while(i< a.length && j < a.length) {
				if(a[i] != b[j] && count < 2) {
					count++;
					if(s1.length() != s2.length()) {
						j++;
						continue;
					}
				}
				i++;
				j++;
			}
			if(count < 2) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
