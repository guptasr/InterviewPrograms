package cpuLoad;

public class Jobs{
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