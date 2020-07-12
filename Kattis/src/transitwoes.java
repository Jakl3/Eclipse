import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class transitwoes {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int s = file.nextInt(), t = file.nextInt(), n = file.nextInt();
		file.nextLine();
		
		String[] timeToWalk = file.nextLine().split(" ");
		String[] busTime = file.nextLine().split(" ");
		String[] intervals = file.nextLine().split(" ");
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {

			sum += Integer.parseInt(timeToWalk[i]);
			sum += nextTime(sum, Integer.parseInt(intervals[i]));
			sum += Integer.parseInt(busTime[i]);
			
		}
		
		sum+= Integer.parseInt(timeToWalk[timeToWalk.length-1]);
		
		System.out.println(sum > (t-s) ? "no" : "yes");
		
	}

	public int nextTime(int current, int interval) {
		while(interval < current) {
			interval += interval;
		}
		return interval - current;
	}
	
	public static void main(String[] args) throws Exception {
		new transitwoes().run();
	}

}