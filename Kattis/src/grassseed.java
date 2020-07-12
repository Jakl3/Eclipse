import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class grassseed {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double cost = file.nextDouble(), times = file.nextInt(), count = 0;
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			count += file.nextDouble() * file.nextDouble();
		}
		
		System.out.printf("%.7f", count*cost);
	}

	public static void main(String[] args) throws Exception {
		new grassseed().run();
	}

}