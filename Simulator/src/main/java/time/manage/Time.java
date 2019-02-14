package time.manage;

public class Time {
	
	private long time;
	private final long tau = 1;
	
	public Time() {
		time = 0;
	}
	
	public void step() {
		time = time + tau;
	}
	
	
}
