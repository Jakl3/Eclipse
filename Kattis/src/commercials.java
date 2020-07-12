import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class commercials {
	public static void main(String[] args) throws Exception {
		new commercials().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt(), p = f.nextInt();
		int[] arr = new int[n];

		int max = 0, current = -1;
		for(int i = 0; i < n; i++) {
			int prof = f.nextInt() - p;
			if(current + prof > 0)
				current += prof;
			else
				current = 0;
			if(current > max) max = current;
		}
		out.println(max);
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