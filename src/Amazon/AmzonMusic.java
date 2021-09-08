package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Bus ride duration is given. And an array is given containing the songs with their duration
 * you have to select 2 songs from the list such that the total duration of both songs 
 * finish 30 seconds before the bus ride ends.
 * If their is more than one pair select the pair with longest song.
 * if two songs have same duration then select the first one in the array. 
 */
/*The Below problem is exactly same it just take movie instead of flight
 * You are on a flight and wanna watch two movies during this flight.
You are given int[] movie_duration which includes all the movie durations.
You are also given the duration of the flight which is d in minutes.
Now, you need to pick two movies and the total duration of the two movies is less than or equal to (d - 30min).
Find the pair of movies with the longest total duration. If multiple found, return the pair with the longest movie.

e.g.
Input
movie_duration: [90, 85, 75, 60, 120, 150, 125]
d: 250

Output from aonecode.com
[90, 125]
90min + 125min = 215 is the maximum number within 220 (250min - 30min)
*/

public class AmzonMusic {
	
	public static void main(String args[]) {
		List<Integer> songDuration = new ArrayList<Integer>();
		
		songDuration.add(20);
		songDuration.add(30);
		songDuration.add(40);
		songDuration.add(20);
		songDuration.add(70);
		songDuration.add(10);
		
		int rideDuration = 90;
		int[] i = findSongs(songDuration,rideDuration);
		System.out.println("["+i[0]+","+i[1]+"]");
	}

	private static int[] findSongs(List<Integer> songDuration, int rideDuration) {
		//System.out.println("in findsongs");
		// TODO Auto-generated method stub
		Collections.sort(songDuration);
		int[] pair= {0,0};
		int i=0,j=songDuration.size()-1;
		int sum;
		while(i<j) {
			sum = songDuration.get(i)+songDuration.get(j);
			if(sum == (rideDuration-30) ) {
				if(pair[1] < songDuration.get(j)) {
					pair[0] = songDuration.get(i);
					pair[1] = songDuration.get(j);
					i++;
					j--;
				}
			}
			if(sum > (rideDuration-30)) {
				j--;
			}else if(sum < (rideDuration-30)) {
				i++;
			}
		}
		//System.out.println(pair[0]+","+pair[1]);
		return pair;
	}

}
