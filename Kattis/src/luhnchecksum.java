import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class luhnchecksum {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String[] s1 = file.nextLine().split("");
			int[] in = new int[s1.length];
			for(int i = 0; i < in.length; i++) {
				in[i] = Integer.parseInt(s1[i]);
			}
			
			
			for(int i = in.length-2; i >= 0; i-=2) {
				int temp = in[i] * 2;
				if(temp > 9) {
					temp = (temp % 10) + 1;
				}
				in[i] = temp;
			}
			
			System.out.println(sumArray(in) % 10 == 0 ? "PASS" : "FAIL");
			
		}
	}
	
	public int sumArray(int[] a) {
		int sum = 0;
		for(int item : a) {
			sum += item;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		new luhnchecksum().run();
	}

}