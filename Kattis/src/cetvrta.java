import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cetvrta {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int x1 = file.nextInt(), y1 = file.nextInt(), x2 = file.nextInt(), y2 = file.nextInt(), x3 = file.nextInt(), y3 = file.nextInt(), xout = 0, yout = 0;
		
		if(x1 == x2) xout = x3;
		else if(x1 == x3) xout = x2;
		else xout = x1;
		
		if(y1 == y2) yout = y3;
		else if(y1 == y3) yout = y2;
		else yout = y1;
		
		System.out.println(xout + " " + yout);
	}

	public static void main(String[] args) throws Exception {
		new cetvrta().run();
	}

}