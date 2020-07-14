import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1371B {
	public static void main(String[] args) throws Exception {
		new CF1371B().run();
	}

	public void run() throws Exception {
		FastScanner file = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int kase = file.nextInt();
		for(int abc = 0; abc < kase; abc++) {
			long n = file.nextLong(), r = file.nextLong();
			if(r < n) {
				System.out.println( (r*(1+r)) / 2);
				continue;
			}
			else {
				System.out.println( (n*(1+n)) / 2 - (n-1));
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

		public void close() throws IOException {
			reader.close();
		}
	}
}