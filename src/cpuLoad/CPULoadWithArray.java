package cpuLoad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CPULoadWithArray {
	
	public static void main(String[] args){
		int[][] a= {{1, 4, 3}, {2, 5, 4}, {7, 9, 6}};

		ArrayList<int[]> job = new ArrayList<int[]>(Arrays.asList(a));
		
		calculateLoad(job);
	}

	public static void calculateLoad(ArrayList<int[]> jobs){
		Collections.sort(jobs, new Comparator<int[]>(){
			
			public int compare(int[] a, int[] b){
				if(a[0] > b[0]){
					return 1;
				}else if(a[0] < b[0]){
					return -1;
				}
				return 0;
			}
		});

		ArrayList<int[]> running = new ArrayList<int[]>();
		int currload = 0, maxload = 0;

		for(int i = 0; i < jobs.size(); i++){
			for(int j = running.size()-1; j > -1 ;j--){
				if(running.get(j)[1] <= jobs.get(i)[0]){
					currload -= running.get(j)[2];
					running.remove(j);
				}

			}
			currload += jobs.get(i)[2];
			running.add(jobs.get(i));

			maxload = Math.max(maxload,currload);
		}
		System.out.println(maxload);
	}



	/*public static void main(String[] args){
		int [][] a = {{1, 4, 3}, {2, 5, 4}, {7, 9, 6}};
		
		//ArrayList<int[]> b = new ArrayList<int[]>(Arrays.asList(a));
		System.out.println(b.get(0)[1]);
		
		calculateLoad(a);
	}

	public static void calculateLoad(int[][] a){
		Arrays.sort(a,new Comparator<int[]>(){
		
			public int compare(int[] first, int[] second){
				if(first[0] < second[0]){
					return -1;
				}else if(first[0] > second[0]){
					return 1;
				}else{
					return 0;
				}
			}
		});
		
		int currload = 0;
		int maxload = 0;
		ArrayList<int[]> running = new ArrayList<int[]>();
		
		for(int i = 0;i < a.length; i++){

			for(int j = running.size()-1 ; j > -1; j--){
				if(running.get(j)[1] < a[i][0]){
					currload -= running.get(j)[2];
					running.remove(j);
				}
			}
			running.add(a[i]);
			currload += a[i][2];
			maxload = Math.max(maxload,currload);	
		}
		System.out.println(maxload);
	}
	public static void main(String[] args){
		int[][] a = {{6, 7, 10}, {2, 4, 11}, {8, 12, 15}};

		ArrayList<int[]> jobs = new ArrayList<int[]>(Arrays.asList(a));
		
		calculateLoad(jobs);
	}

	public static void calculateLoad(ArrayList<int[]> job){
		Collections.sort(job, new Comparator<int[]>(){
			
			public int compare(int[] a, int[] b){
				if(a[0] < b[0]){
					return -1;
				}else if(a[0] > b[0]){
					return 1;
				}else{
					return 0;
				}
			}	
		});

		ArrayList<int[]> running = new ArrayList<int[]>();
		int currload = 0, maxload = 0;
		for(int i = 0; i < job.size(); i++){
			for(int j = running.size()-1; j > -1 ; j--){
				if(running.get(j)[1] <= job.get(i)[0]){
					currload -= running.get(j)[2];
					running.remove(j);
				}
			}
			currload += job.get(i)[2];
			running.add(job.get(i));
			maxload = Math.max(maxload,currload);
		}
		System.out.println(maxload);
	}*/

}
