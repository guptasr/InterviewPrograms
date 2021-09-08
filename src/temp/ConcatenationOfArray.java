package temp;


import java.util.*;

/*
 * Concatenate the elements of array to get the biggest possible number
 */

public class ConcatenationOfArray {

    // The main function that prints the
    // arrangement with the largest value.
    // The function accepts a vector of strings
    static void printLargest(int[] ar1)
    {
    	String a = Arrays.toString(ar1);
    	String[] b = a.substring(1,a.length()-1).split(", ");
    	List<String> arr = new ArrayList<String>(Arrays.asList(b)); 
 
        Collections.sort(arr, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override 
            public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;// reversing the o/p so that array can be sort in desending order
            }
        });
 
        Iterator it = arr.iterator();
 
        while (it.hasNext())
            System.out.print(it.next());
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
    	int[] arr = {7,5,2,4,8,9,5,500,50,5010,7000};
        /*Vector<String> arr;
        arr = new Vector<>();
        
 
        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");*/
        printLargest(arr);
    }
}