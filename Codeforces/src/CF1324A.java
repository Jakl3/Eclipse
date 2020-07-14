import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1324A {
	public static void main(String[] args) throws Exception {
		new CF1324A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			int[] arr = new int[n];
			int max = 0;
			for(int i = 0; i < n; i++) {
				arr[i] = f.nextInt();
				if(arr[i] > max) max = arr[i];
			}
			boolean ok = true;
			for(int i = 0; i < n; i++) {
				if((max-arr[i]) % 2 != 0) ok = false;
			}
			out.println(ok ? "YES" : "NO");
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