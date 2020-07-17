import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class cookingwater {
	public static void main(String[] args) throws Exception {
		new cookingwater().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		int[] arr = new int[1002];
		for(int i = 0; i < n; i++) {
			int a = f.nextInt(), b = f.nextInt();
			for(int j = a; j <= b; j++) {
				arr[j]++;
			}
		}
		boolean ok = false;
		for(int i = 0; i < 1002; i++) {
			if(arr[i] == n) {
				ok = true;
				break;
			}
		}
		out.println(ok ? "gunilla has a point" : "edward is right");
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