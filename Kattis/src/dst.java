import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class dst {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(file.readLine());
		
		for(int i = 0; i < cases; i++) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			boolean fwd = st.nextToken().equals("F");
			
			int change = Integer.parseInt(st.nextToken());
			if(!fwd) change = -change;
			
			int init = changeToMinutes(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			
			init += change;
			
			if(init >= 1440) init = init - 1440;
			else if(init < 0) init = 1440 + init;
			
			System.out.println(changeToHours(init));
			
		}
	}
	
	public int changeToMinutes(int hour, int minute) {
		return (hour * 60) + minute;
	}
	
	public String changeToHours(int minutes) {
		int hour = minutes/60;
		int minute = minutes % 60;
		return hour + " " + minute;
	}

	public static void main(String[] args) throws Exception {
		new dst().run();
	}

}