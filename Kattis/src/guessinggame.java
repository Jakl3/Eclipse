import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class guessinggame {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		
		int low = 1, high = 10, num;
		while(true) {
			num = Integer.parseInt(file.readLine());
			if(num == 0)
				break;
			
			String in = file.readLine();

			if(in.equals("right on")) {
				System.out.println(low <= num && num <= high ? 
						"Stan may be honest" : "Stan is dishonest");
				low = 1;
				high = 10;
			}
			else if(in.equals("too high"))
				high = Math.min(high, num-1);
			else
				low = Math.max(low, num + 1);

		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new guessinggame().run();
	}

}