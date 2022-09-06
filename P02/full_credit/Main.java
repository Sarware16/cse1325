
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int hours, minutes, seconds;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Hours? ");
		hours = in.nextInt();
		
		System.out.print("Minutes? ");
		minutes = in.nextInt();
		
		System.out.print("Seconds? ");
		seconds = in.nextInt();

		Clock time = new Clock(hours, minutes, seconds);
		System.out.println(time);


	}
}