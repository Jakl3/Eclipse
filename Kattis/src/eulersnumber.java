import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class eulersnumber {
	public static void main(String[] args) throws Exception {
		new eulersnumber().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		BigInteger[] fact = new BigInteger[100];
		fact[0] = new BigInteger("1");
		for(int i = 1; i < 100; i++) {
			fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
		}
		double e = 0;
		int n = f.nextInt();
		for(int i = 0; i <= n && i < 100; i++) {
			e += 1 / (fact[i]).doubleValue();
		}
		out.println(e);
		
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