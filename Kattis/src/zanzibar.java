import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class zanzibar {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String[] in = file.nextLine().split(" ");
			int[] n = new int[in.length];
			
			int sum = 0;
			for(int i = 0; i < in.length; i++) {
				n[i] = Integer.parseInt(in[i]);
			}
			
			for(int i = 1; i < n.length; i++) {
				if(n[i-1]*2 < n[i]) sum += n[i] - (n[i-1]*2);
			}
			
			System.out.println(sum);
			
			
			
			
		}
	}

	public static void main(String[] args) throws Exception {
		new zanzibar().run();
	}

}