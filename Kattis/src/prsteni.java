import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class prsteni {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		double first = file.nextDouble();
		for (int asdf = 0; asdf < times-1; asdf++) {
			System.out.println(reduceFrac(first,file.nextDouble()));
		}
	}
	
	private static String reduceFrac(double num, double denom) {
		double d = gcd(num,denom);
		num /= d;
		denom /= d;
		return ((int)num + "/" + (int)denom);
		
		
	}
	
	private static double gcd(double a, double b) {
		if(b == 0)
			return a;
		return gcd(b, a % b);
		
	}

	public static void main(String[] args) throws Exception {
		new prsteni().run();
	}

}