import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class synchronizinglists {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			int nums = file.nextInt();
			int[] hold = new int[nums];
			int[] one = new int[nums];
			int[] two = new int[nums];
			for(int i = 0; i < nums; i++) {
				int n = file.nextInt();
				one[i] = n;
				hold[i] = n;
			}
			for(int i = 0; i < nums; i++) {
				two[i] = file.nextInt();
			}
			
			Arrays.sort(one);
			Arrays.sort(two);
			
			for(int item : hold) {
				int pos = Arrays.binarySearch(one, item);
				System.out.println(two[pos]);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		new synchronizinglists().run();
	}

}