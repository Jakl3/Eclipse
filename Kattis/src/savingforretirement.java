import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class savingforretirement {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		double b, br, bs, a, as;
		b = file.nextDouble();
		br = file.nextDouble();
		bs = file.nextDouble();
		a = file.nextDouble();
		as = file.nextDouble();
		
		double bob = (br - b) * bs + 1;
		
		// (x - a) * as > bob
		// (bob / as) < x - a
		// bob / as + a
		
		double alice = Math.ceil(bob / as);
		
		System.out.println( (int)(alice + a));
		
		

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new savingforretirement().run();
	}

}