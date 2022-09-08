public class Clock {
	
	private int hours;
	private int minutes;
	private int seconds;

	public Clock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	private String twoDigit(int i) {
		if(i<10){
			return "0" + i;
		}
		return ""+ i;
	}

	@Override
	public String toString() {

		return "The time is " + twoDigit(hours) + ":" + twoDigit(minutes) + ":" + twoDigit(seconds);
	}	
}