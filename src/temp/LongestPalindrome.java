/*
Given a string s, return the longest palindromic substring in s.
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
*/

class LongestPalindrome {
  public static void main(String[] args){
    String s = "babad";
    System.out.println(longestPalindrome(s));
  }
    public String longestPalindrome(String s) {
        String palindrome = s.substring(0,1);
        int i=0,j=0;
        for(i=s.length();i >= 0;i--){
            for(j=s.length();(j-i) >= 0;j--){
                //System.out.println("SubString ="+s.substring(j-i,j));
                if(isPalindrome(s.substring(j-i,j))){
                    palindrome = s.substring(j-i,j);
                    return palindrome;
                }
            }
        }
        return palindrome;
    }

    public Boolean isPalindrome(String s){
        int n = 0, m = s.length()-1;
        for(int j = 0 ; j< s.length(); j++){
            if(!(s.charAt(n+j) == s.charAt(m-j))){
                return false;
            }
        }
        return true;
    }
}
