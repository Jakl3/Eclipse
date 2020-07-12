import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pizza2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int r = file.nextInt(), c = file.nextInt();
		
		double totArea = Math.PI * r * r;
		double cheese = Math.PI * (r - c) * (r - c);
		
		System.out.println(100.0 * (cheese / totArea));
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new pizza2().run();
	}

}