import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class beavergnaw {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(true) {
			double D = file.nextDouble();
			double V = file.nextDouble();
			
			if(D == 0 && V == 0) break;
			
			double out = Math.pow(D, 3) - 6*V/Math.PI;
			
			System.out.println(Math.pow(out, (1.0/3)));
			
			
			
		}
	}

	public static void main(String[] args) throws Exception {
		new beavergnaw().run();
	}

}