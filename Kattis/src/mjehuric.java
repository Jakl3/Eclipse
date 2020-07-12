import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mjehuric {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int[] good = {1,2,3,4,5};
		int[] order = new int[5];
		for(int i = 0; i < 5; i++) {
			order[i] = file.nextInt();
		}
		while(equals(order,good) == false) {
			if(order[0] > order[1]) {
				int temp = order[0];
				order[0] = order[1];
				order[1] = temp;
				System.out.println(Arrays.toString(order).replaceAll("[\\[\\],]", ""));
			}
			if(order[1] > order[2]) {
				int temp = order[1];
				order[1] = order[2];
				order[2] = temp;
				System.out.println(Arrays.toString(order).replaceAll("[\\[\\],]", ""));
			}
			if(order[2] > order[3]) {
				int temp = order[2];
				order[2] = order[3];
				order[3] = temp;
				System.out.println(Arrays.toString(order).replaceAll("[\\[\\],]", ""));
			}
			if(order[3] > order[4]) {
				int temp = order[3];
				order[3] = order[4];
				order[4] = temp;
				System.out.println(Arrays.toString(order).replaceAll("[\\[\\],]", ""));
			}
			
			
		}
		
	}
	
	public static boolean equals(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		new mjehuric().run();
	}

}