import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pet {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int pos = 1, score = Integer.MIN_VALUE;
		//System.out.println(pos + " " + score);
		for(int i = 0; i < 5; i++) {
			String[] in = file.nextLine().split(" ");
			//System.out.println(Arrays.toString(in));
			int x = sum(in);
			if(x > score) {
				score = x;
				pos = i+1;
			}
			//System.out.println(x);
		}
		
		System.out.println(pos + " " + score);
		
	}
	
	public int sum(String[] in) {
		int sum = 0;
		for(String item : in) {
			sum += Integer.parseInt(item);
		}
		return sum;
	}
	

	public static void main(String[] args) throws Exception {
		new pet().run();
	}

}