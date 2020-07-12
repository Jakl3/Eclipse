import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class batterup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double times = file.nextInt(), count = 0.0, bat = times;
		
		for (int asdf = 0; asdf < times; asdf++) {
			int i = file.nextInt();
			if(i != -1) count+=i;
			else bat += i;
			
			//System.out.println(i);
		}
		
		
		System.out.println(count/bat);
	}

	public static void main(String[] args) throws Exception {
		new batterup().run();
	}

}