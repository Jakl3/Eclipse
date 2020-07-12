import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class flexible {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int w = file.nextInt(), p = file.nextInt();
		int[] arr = new int[p+2];
		arr[0] = 0;
		arr[arr.length-1] = w;
		
		for(int i = 1; i < arr.length-1; i++) {
			arr[i] = file.nextInt();
		}
		
		Set<Integer> possible = new TreeSet<Integer>();
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				possible.add(arr[j] - arr[i]);
			}
		}
		System.out.println(possible.toString().replaceAll("[\\[\\],]", ""));

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new flexible().run();
	}

}