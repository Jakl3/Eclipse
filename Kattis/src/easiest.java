import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class easiest {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			int N = file.nextInt();
			if(N == 0) break;
			int digits = sumOfDigits(N);
			
			int tester = 10;
			boolean found = false;
			while(found == false) {
				tester++;
				if(sumOfDigits(tester * N) == digits) {
					found = true;
				}
			}
			System.out.println(tester);
		}
	}
	
	public int sumOfDigits(int n) {
		int sum = 0;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		new easiest().run();
	}

}