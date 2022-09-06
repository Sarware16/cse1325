public class Clock {
	
	private int hours;
	private int minutes;
	private int seconds;

	public Clock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "The time is " + hours + ":" + minutes + ":" + seconds;
	}
}