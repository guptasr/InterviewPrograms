package cpuLoad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class CPULoad {
	
	static class Jobs{
		int start,end,load;
		
		public Jobs(int s, int e, int l) {
			start = s;
			end = e;
			load = l;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}
	}
	
	/*public static void main(String args[]) {
		
		List<Jobs> job = new ArrayList<Jobs>();
		
		Comparator<Jobs> cm2=Comparator.comparing(Jobs::getStart);  

		job.add(new Jobs(1,4,3));
		job.add(new Jobs(2,5,4));
		job.add(new Jobs(7,9,6));
		//job.add(new Jobs(4,15,12));
		
		Collections.sort(job,cm2);
		
		int maxload=0,currentload = 0;		
		
		List<Jobs> running = new LinkedList<Jobs>();
		
		for(Jobs j1:job) {
			if(!running.isEmpty()) {
				
				for(Jobs j2:running) {
					System.out.println("j2"+ j2.end);
					if(j2.end < j1.start) {
						currentload -= j2.load;
						j2.end = j1.end;
						j2.load = 0;
					}
					
				}
				running.add(j1);
				currentload += j1.load;
				
				maxload = Math.max(currentload,maxload);
				
			}else {
				running.add(j1);
				currentload += j1.load;
			}
		}
		System.out.println("load="+maxload);
		

		/*for(int i=1;i < job.size();i++) {
			
			if(j1.end > job.get(i).start) {
				currentload += job.get(i).load;
				
				if(currentload > maxload) {
					maxload = currentload;
				}
			}else {
				if(maxload < job.get(i).load) {
					maxload = job.get(i).load;
				}
				currentload = job.get(i).load;
			}
		}
		System.out.println("maxload="+ maxload);
		
		for(int i=0;i<(job.size())-1;i++) {
			
			if(job.get(i).end > job.get(i+1).start) {
				do {
					System.out.println("i="+i);
					currentload += (job.get(i).load + job.get(i+1).load);
					i++;
				}while(job.get(i).end > job.get(i+1).start);
				i--;
				if(currentload > maxload) {
					maxload = currentload;
				}
			}else
			{
				if(maxload < job.get(i).load) {
					maxload = job.get(i).load;
				}
			}
			currentload = 0;
			
		}
		
		System.out.println("Load = " + maxload);
	}*/

		public static void main(String[] args){
			ArrayList<Jobs> job = new ArrayList<Jobs>();
			job.add(new Jobs(1, 4, 3));
			job.add(new Jobs(2, 5, 4));
			job.add(new Jobs(7, 9, 6));
			calculateLoad(job);
		}

		public static void calculateLoad(ArrayList<Jobs> arr){
			
			Comparator<Jobs> a = Comparator.comparing(Jobs::getStart);
			Collections.sort(arr,a);		
			ArrayList<Jobs> running = new ArrayList<Jobs>();
			int maxLoad = 0;
			int currentLoad = 0;
			
			for(int i = 0; i < arr.size(); i++ ){
				running.add(arr.get(i));
				for(int j = i-1; j > -1; j--){
					if(running.get(j).end < arr.get(i).start){
						currentLoad -= running.get(j).load;
						running.remove(j);
						//running.get(j).load =0;
					}
				}
				currentLoad += arr.get(i).load;
				maxLoad = Math.max(currentLoad,maxLoad);
			}
			System.out.println(maxLoad);
		}
	

}

