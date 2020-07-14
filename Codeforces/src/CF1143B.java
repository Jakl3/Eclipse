import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1143B {
	public static void main(String[] args) throws Exception {
		new CF1143B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s = f.nextLine();
		int[] arr = Arrays.stream(s.split("")).mapToInt(an -> Integer.parseInt(an)).toArray();
		arr[0]--;
		String s2 = "" + arr[0];
		for(int i = 1; i < arr.length; i++) {
			arr[i] = 9;
		}
		out.println(Arrays.toString(arr));
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