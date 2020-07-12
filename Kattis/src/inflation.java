import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class inflation {
	public static void main(String[] args) throws Exception {
		new inflation().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int t = f.nextInt();
			arr[i] = t;
			sum+=t;
		}
		boolean ok = true;
		Arrays.sort(arr);
		double min = 1;
		for(int i = 1; i <= n; i++) {
			if(arr[i-1] > i) ok = false;
			min = Math.min((double)arr[i-1]/(i), min);
		}
		out.println(ok ? min : "impossible");
		
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