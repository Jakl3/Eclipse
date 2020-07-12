import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class stararrangements {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double states = file.nextDouble();
		System.out.println((int)states + ":");
		
		for(int x = 2; x < Math.round(states/2)+1; x++) {
			int y = x-1;
			
			if(states % (x+y) == x || states % (x+y) == 0) 
				System.out.println(x + "," + y);
			
			if(states % x == 0)
				System.out.println(x + "," + x);
		}
		
		
		
		/*System.out.println(states + ":");
		for(String item : patterns) {
			if(!item.equals("1,1")) {
				System.out.println(item);
			}
		}*/
	}

	public static void main(String[] args) throws Exception {
		new stararrangements().run();
	}

}