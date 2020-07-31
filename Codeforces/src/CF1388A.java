import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1388A {
	public static void main(String[] args) throws Exception {
		new CF1388A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int n = f.nextInt();
			if(n <= 30) out.println("NO");
			
			else {
				//2 * 3, 2 * 5, 2 * 7
				out.println("YES");
				
				if(n == 36) out.println("6 10 15 5");
				else if(n == 44) out.println("6 10 15 13");
				else if(n == 40) out.println("6 10 15 9");
				else out.println("6 10 14 " + (n-30));
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