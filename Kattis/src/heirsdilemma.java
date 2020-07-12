import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class heirsdilemma {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		int start = file.nextInt();
		int end = file.nextInt();
		
		int count = 0;
		
		for(int i = start; i <= end; i++) {
			if(good(i)) count++;

		}
		
		System.out.println(count);
	}
	
	/*public boolean allDifferent(int n) {
		String[] in = (""+n).split("");
		boolean[] bruh = new boolean[9];
		for(int i = 0; i < in.length; i++) {
			if(bruh[Integer.parseInt(in[i])-1] == true) return false;
			bruh[Integer.parseInt(in[i])-1] = true;
		}
		return true;
	}
	
	public boolean isDivisible(int n) {
		String[] in = ("" + n).split("");
		for(String item : in) {
			if(n % Integer.parseInt(item) != 0) return false;
		}
		return true;
	}*/

	public boolean good(int n) {
		int temp = n;
		boolean[] used = new boolean[10];
		while(temp > 0) {
			int current = temp % 10;
			temp = (temp - current) / 10;
			
			if(used[current]) return false;
			used[current] = true;
			
			if(current == 0 || n % current != 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		new heirsdilemma().run();
	}

}