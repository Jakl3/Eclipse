import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1388B {
	public static void main(String[] args) throws Exception {
		new CF1388B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int n = f.nextInt();
			int i = 0;
			int k = 0;
			while(i < n) {
				i += 4;
				k++;
			}
			//out.println(i + " " + k);
			char[] c = new char[n];
			for(int j = 0; j < n-k; j++) c[j] = '9';
			for(int j = n-k; j < n; j++) c[j] = '8';
			System.out.println(new String(c));
		}
		///
		out.flush();
	}
	
	public String get(int n) {
		String s = "";
		while(n > 0) {
			s = Integer.toBinaryString(n % 10) + s;
			n/=10;
		}
		return s;
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