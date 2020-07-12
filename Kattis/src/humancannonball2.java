import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class humancannonball2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			double v = file.nextDouble(), the = file.nextDouble(), x = file.nextDouble(), h1 = file.nextDouble(), h2 = file.nextDouble();
			
			the = Math.toRadians(the);
			
			double t = x / (v * Math.cos(the));
			
			double h = v * t * Math.sin(the) - .5 * 9.81 * Math.pow(t, 2);
			
			//System.out.println(h + " " + h1 + " " + h2);
			
			System.out.println(h >= h1+1 && h <= h2-1 ? "Safe" : "Not Safe");
		}
	}

	public static void main(String[] args) throws Exception {
		new humancannonball2().run();
	}

}