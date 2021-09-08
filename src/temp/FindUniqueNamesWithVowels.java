package temp;

import java.io.*;
import java.util.*;

public class FindUniqueNamesWithVowels {
	
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
    static void Main(String[] args)
    {
        //TODO 1: Implement GetUniqueWords function, such that the returned array has no duplicates and has only words starting with a vowel
        //TODO 2: Also implement the Nnuit test for the class FindUniqueNamesWithVowels

        String[] names1 = new String[] { "Amazon", "Elephant", "Uber", "good" };
        String[] names2 = new String[] { "English", "France", "Elephant" };
        System.out.println( GetUniqueWords(names1, names2)); // should print Amazon, Elephant, Uber, English
        System.out.println(names1.length);
        //Console.ReadKey();
    }

}
