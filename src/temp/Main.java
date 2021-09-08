package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) throws IOException {
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	        
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    String[] arr = {"Ravi","raj","Ravi","ram"};
	    String a = "abc";
	    	char ch = a.charAt(1);
	    	System.out.println(ch);
	    		System.out.println(a.substring(0,1)+a.substring(2));
	    
	    HashSet<String> arr1 = new HashSet<String>(Arrays.asList(arr));
	    arr1.toArray(arr);
	    System.out.println(arr1);
	    while ((line = in.readLine()) != null) {
	    	
	    	calculateChange(line);
	 
	      
	    }
	    
	   
	}
	 public static void calculateChange(String line) {
    	 double pp = Double.parseDouble(line.split(";")[0]);
         double ch = Double.parseDouble(line.split(";")[1]);
         double[] arr = {.01,.05,.1,.25,1,5,10,20,50,100};
         String[] curr = {"PENNIES","NICKELS","DIMES","QUARTERS","DOLLARS","FIVES","TENS","TWENTIES","FIFTY","ONE HUNDRED"};
         StringBuilder change = new StringBuilder();
         
         double amount = ch-pp;
         
         for(int i = arr.length-1;i >= 0;i--) {
        	 while(amount >= arr[i]) {
        		 amount -= arr[i];
        		 change.append(curr[i]);
        		 if(amount != 0.00) {
		            
		        	change.append(",");
		        }
        	 }
        	 if(amount == 0.00) {
        		 break;
    }
  }
         System.out.println(change);
}
}
	
	
		//int a=10;
	 /*public static void main(String[] args) 
	    { 
		 int size,m=0;
         Scanner in = new Scanner(System.in);
         System.out.print("input array size ") ;
         size = in.nextInt();
         int[] a = new int[size];
         for(int i=0; i<size;i++){
             System.out.print("Enter "+ i +" index number ");
             a[i]=in.nextInt() ;
             m=a[i]/2;
             if(m>1){
                 for(int j=2; j<=m;j++){
                     if(a[i] % j == 0){
                     a[i]=0;
                     break;
                     }
                 }
             }
         }
         for(int i=0; i<size;i++){
         if(a[i]!=0){
         for(int j=1; j<=a[i];j++){
         System.out.print(j+" ");
         }
         System.out.println();
         }
         }
		 /*Main ma=new Main();
		 System.out.println(ma.a);
	        String str = "ABC"; 
	        int n = str.length(); 
	        Main permutation = new Main(); 
	        permutation.permute(str, 0, n-1); */
	   /* } 
	 
	    
	    private void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	            System.out.println(str); 
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	            	System.out.println("before swap 1"+str);
	            	
	                str = swap(str,l,i); 
	                System.out.println("after swap 1 "+str);
	                permute(str, l+1, r); 
	                System.out.println("before swap 2"+str);
	                str = swap(str,l,i); 
	                System.out.println("after swap 2 "+str);
	            } 
	        }	
	    } 
	 
	    /** 
	    * Swap Characters at position 
	    * @param a string value 
	    * @param i position 1 
	    * @param j position 2 
	    * @return swapped string 
	    
	    public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        System.out.println("l="+i+"i="+j);
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } /*
	
	 public static void main(String[] args)
	    {
	        //TODO 1: Implement GetUniqueWords function, such that the returned array has no duplicates and has only words starting with a vowel
	        //TODO 2: Also implement the Nnuit test for the class FindUniqueNamesWithVowels

	        String[] names1 = new String[] { "Amazon", "Elephant", "Uber", "good" };
	        String[] names2 = new String[] { "English", "France", "Elephant" };
	        names2 = GetUniqueWords(names1, names2); // should print Amazon, Elephant, Uber, English
	        for(String a : names2)
	        {
	        	System.out.println(a);
	        }
	        //Console.ReadKey();
	    }
	
	public static String[] GetUniqueWords(String[] names1, String[] names2)
    {
		char vowels[] = "aeiouAEIOU".toCharArray();
		String b;
		HashSet<String> name1 = new HashSet<String>(Arrays.asList(names1));
		HashSet<String> name2 = new HashSet<String>(Arrays.asList(names2));
		
		name1.addAll(name2);
		name2.clear();
		Iterator<String> itr= name1.iterator();
		Character a;
		while(itr.hasNext())
		{
			b=itr.next();
			a=Character.toUpperCase(b.charAt(0));
			if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
				name2.add(b);				
			}
		}
		
		return name2.toArray(names1);

    }
   
    
/*public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in); 
		
		String a= in.nextLine();
		
		System.out.println(mirrorChars(a));
		
		
	}

	public static int mirrorChars(String a) {
		// TODO Auto-generated method stub
		
		int result =0;
		  int halfLen = (int) Math.ceil(a.length() / 2);
		  int lastIndex = a.length() - 1;
		  for (int i = 0; i < halfLen; i++) {
		    if (a.charAt(i) == a.charAt(lastIndex - i)) result=result+2;
		  }
		
		return result;
	}*/

/*}*/
