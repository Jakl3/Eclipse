import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class missingnumbers {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		int[] line = new int[210];
		int last = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			int in = file.nextInt();
			line[in-1] = in;
			if(asdf == times-1) {
				last = in;
			}
		}
		
		boolean b = false;
		for(int i = 0; i < last; i++) {
			if(line[i] == 0) {
				System.out.println(i+1);
				b = true;
			}

		}
		
		if(b == false) {
			System.out.println("good job");
		}
		
	}

	public static void main(String[] args) throws Exception {
		new missingnumbers().run();
	}

}