import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class halfacookie {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			double r = file.nextDouble(), x = file.nextDouble(), y = file.nextDouble();
			
			double r1 = distance(0,0,x,y);
			if(r1 >= r) {
				System.out.println("miss");
				continue;
			}
			
			double res = 2 * Math.sqrt(r * r - r1 * r1);
			
			double alpha = 2 * Math.asin(res / (2*r));
			
			double a1 = .5 * r * r * (alpha - Math.sin(alpha));
			
			double area = Math.PI * r * r;
			System.out.println((area - a1) + " " + a1);
			
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new halfacookie().run();
	}

	public double distance(double x1, double y1, double x2, double y2) {       
			    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	
}