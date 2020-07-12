import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class rationalsequence2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int cases = Integer.parseInt(file.nextLine());

		for (int asdf = 0; asdf < cases; asdf++) {
			String[] line = file.nextLine().split("([ /])");
			
			int num = Integer.parseInt(line[0]);
			int numerator = Integer.parseInt(line[1]);
			int denominator = Integer.parseInt(line[2]);
			
			StringBuilder sb = new StringBuilder();
			while(numerator > 1 || denominator > 1) {
				if(numerator > denominator) {
					numerator -= denominator;
					sb.append('R');
				}
				else {
					denominator -= numerator;	
					sb.append('L');
				}
			}
			
			int i = 1;
			char[] arr = sb.reverse().toString().toCharArray();
			System.out.println(Arrays.toString(arr));
			for(char item : arr) {
				i *= 2;
				if(item == 'R') i++;
			}
			
			System.out.println(num + " " + i);
			
		
		}
	}

	public static void main(String[] args) throws Exception {
		new rationalsequence2().run();
	}

}