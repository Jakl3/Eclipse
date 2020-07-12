import java.util.*;
import java.io.*;

public class dasblinkenlights {
	public static void main(String[] args) throws Exception {
		new dasblinkenlights().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int[] x = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		System.out.println(lcm(x[0],x[1]) <= x[2] ? "yes" : "no");

		file.close();
	}
	
	public int gcd(int a, int b) {
		int rem = 0;
		do {
			rem = a % b;
			a = b;
			b = rem;
		} while(b != 0);
		return a;
	}
	
	public int lcm(int a, int b) {
		if(a == 0 || b == 0) return 0;
		return (a * b) / gcd(a, b);
	}

}