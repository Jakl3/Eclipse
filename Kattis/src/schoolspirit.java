import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class schoolspirit {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int n = file.nextInt();
		
		int[] list = new int[n];
		Arrays.sort(list);
		
		for(int i = 0; i < n; i++) {
			list[i] = file.nextInt();
		}
		
		double initialValue = 0;
		for(int i = 0; i < n; i++) {
			initialValue += list[i] * Math.pow(.8, i);
		}
		initialValue /= 5.0;
		
		
		double gTotal = 0;
		for(int i = 0; i < n; i++) {
			double temp = 0;
			int d = 0;
			for(int j = 0; j < n; j++) {
				if(i != j) {
					temp += list[j] * Math.pow(.8, d);
					d++;
				}
				
			}
			temp /= 5.0;
			gTotal += temp;
			
		}
		gTotal /= n;
		
		System.out.printf("%.10f\n%.10f\n",initialValue, gTotal);
	}

	public static void main(String[] args) throws Exception {
		new schoolspirit().run();
	}

}