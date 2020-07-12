import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class rijeci {
	
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		/*int times = file.nextInt();
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		for(int i = 2; i < times+1; i++) {
			fib.add(fib.get(i-1) + fib.get(i-2));
		}

		System.out.println(fib);
		//System.out.println(fib.get(fib.size()-2) + " " + fib.get(fib.size()-1));
		 */
		
		int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170};
		int times = file.nextInt();
		System.out.println(fib[times-1] + " " + fib[times]);
		
	}

	public static void main(String[] args) throws Exception {
		new rijeci().run();
	}

}