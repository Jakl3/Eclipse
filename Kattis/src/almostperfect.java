import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class almostperfect {
	public void run() throws Exception {
		Kattio file = new Kattio(System.in);
		while(file.hasNext()) {
			int num = file.nextInt();
			int sum = factorSum(num);
			
			System.out.print(num + " ");
			if(num == sum) 
				System.out.println("perfect");
			else if(Math.abs(sum - num) <= 2)
				System.out.println("almost perfect");
			else 
				System.out.println("not perfect");
		}

		file.close();
	}
	
	public int factorSum(int n) {
		int sum = 0;
		
		double x = Math.sqrt(n);
		
		if ((int)x == x)
			sum += (int)x;
		
		
		for(int i = 2; i < x; i++) {
			if(n % i == 0) {
				sum += (i) + (n/i);
			}
		}
		return (sum+1);
	}

	

	public static void main(String[] args) throws Exception {
		new almostperfect().run();
	}

	private class Kattio extends PrintWriter {

		private BufferedReader r;
		private String line;
		private StringTokenizer st;
		private String token;

		public Kattio(InputStream i) {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(i));
		}

		public Kattio(InputStream i, OutputStream o) {
			super(new BufferedOutputStream(o));
			r = new BufferedReader(new InputStreamReader(i));
		}

		public boolean hasNext() {
			return peekToken() != null;
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public String next() {
			return nextToken();
		}

		public String nextLine() {
			token = null;
			st = null;
			try {
				return r.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		private String peekToken() {
			if (token == null)
				try {
					while (st == null || !st.hasMoreTokens()) {
						line = r.readLine();
						if (line == null)
							return null;
						st = new StringTokenizer(line);
					}
					token = st.nextToken();
				} catch (IOException e) {
				}
			return token;
		}

		private String nextToken() {
			String ans = peekToken();
			token = null;
			return ans;
		}
	}

}