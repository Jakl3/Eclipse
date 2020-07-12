import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class deathknight {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		int count = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			char[] in = file.nextLine().toCharArray();
			boolean good = true;
			
			for(int i = 0; i < in.length-1; i++) {
				if(in[i] == 'C' && in[i+1] == 'D') {
					good = false;
					break;
				}
			}
			if(good) count++;
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new deathknight().run();
	}

}