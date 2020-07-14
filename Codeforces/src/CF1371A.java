import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1371A {
	public static void main(String[] args) throws Exception {
		new CF1371A().run();
	}

	public void run() throws Exception {
		FastScanner file = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int kase = file.nextInt();
		while(kase-->0) {
			double n = file.nextDouble();
			out.println((int)Math.ceil(n/2));
		}
		///
		file.close();
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