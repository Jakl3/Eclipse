import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sumsquareddigits {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {

			int k = file.nextInt();
			int b = file.nextInt();
			int n = file.nextInt();
			String[] in = Integer.toString(n,b).split("");
			
			int sum = 0;
			
			for(String item : in) {
				sum+= Math.pow(Integer.parseInt(item, b), 2);
			}
			
			System.out.println(k + " " + sum);
			
		}
	}

	public static void main(String[] args) throws Exception {
		new sumsquareddigits().run();
	}

}