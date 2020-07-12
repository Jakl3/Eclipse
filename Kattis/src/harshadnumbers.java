import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class harshadnumbers {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int in = file.nextInt(), out = in;
		
		while(out % sumDigits(out) != 0 || out < in) {
			out++;
		}
		
		
		System.out.println(out);
	}
	
	public int sumDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		new harshadnumbers().run();
	}

}