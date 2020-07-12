import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class judgingmoose {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int l = file.nextInt(), r = file.nextInt();
		if(l == 0 && r == 0) System.out.println("Not a moose");
		else if(l == r) System.out.println("Even " + (l + r));
		else System.out.println("Odd " + (2 * Math.max(l, r)));
	}

	public static void main(String[] args) throws Exception {
		new judgingmoose().run();
	}

}