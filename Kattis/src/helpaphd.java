import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class helpaphd {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String bruh = file.nextLine();
			int out = 0;
			if(bruh.contains("+")) {
				String[] in = bruh.split("\\+");
				out = Integer.parseInt(in[0]) + Integer.parseInt(in[1]);
				System.out.println(out);
			}
			else
				System.out.println("skipped");
		}
	}

	public static void main(String[] args) throws Exception {
		new helpaphd().run();
	}

}