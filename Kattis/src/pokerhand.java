import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pokerhand {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		char[] in = file.nextLine().trim().toCharArray();
		
		char[] ranks = "A23456789TJQK".toCharArray();
		
		Arrays.sort(in);
		
		int max = 0, i = 0;
		
		for(char item : ranks) {
			int count = 0;
			
			for(char val : in) {
				if(val == item) count++;
			}
			
			if(count > max) max = count;
		}
		
		
		System.out.println(max);
	}

	public static void main(String[] args) throws Exception {
		new pokerhand().run();
	}

}