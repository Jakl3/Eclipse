import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hothike {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = file.nextInt();
		}
		
		int max = Integer.MAX_VALUE;
		int start = 0;
		for(int i = 0; i < n-2; i++) {
			if(arr[i] < max && arr[i+2] < max) {
				start = i;
				max = Math.max(arr[i], arr[i+2]);
			}
		}
		
		System.out.println((start+1) + " " + max);

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new hothike().run();
	}

}