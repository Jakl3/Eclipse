import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1385A {
	public static void main(String[] args) throws Exception {
		new CF1385A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			// if x < y, c > a and c > b, z has to equal y
			// if x > y, b > c and b > a, z has to equal x
			// if z < y, a > b and a > c, x has to equal y
			// if z > y, b > c and b > a, x has to equal z
			
			int x = f.nextInt(), y = f.nextInt(), z = f.nextInt();
			if( (x < y && y != z) || (x > y && x != z) || (z < y && x != y) || (z > y && x != z)) out.println("NO");
			else {
				out.println("YES");
				int k = Math.min(x, Math.min(y, z));
				out.println(k + " " + Math.max(x, Math.max(y,z)) + " " + k);
			}
		}
		///
		out.flush();
	}

	///
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}