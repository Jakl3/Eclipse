import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class zamka {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int l = file.nextInt(), d = file.nextInt(), x = file.nextInt();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int i = l; i <= d; i++) {
			if(sum(i) == x) {
				if(i < min) min = i;
				if(i > max) max = i;
			}
		}
		
		
		
		System.out.println(min + "\n" + max);
	}
	
	public int sum (int in) {
		int sum = 0;
		while(in > 0) {
			sum += in %10;
			in/=10;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		new zamka().run();
	}

}