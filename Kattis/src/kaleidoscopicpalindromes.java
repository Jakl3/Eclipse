import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class kaleidoscopicpalindromes {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new kaleidoscopicpalindromes().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int a = f.nextInt(), b = f.nextInt(), k = f.nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++) {
			
			boolean ok = true;
			for(int j = 2; j <= k; j++) {
				String t = Integer.toString(i,j);
				if(!t.equals(new StringBuilder(t).reverse().toString())) {
					ok = false;
					break;
				}
			}
			if(ok) cnt++;
			
		}
		out.println(cnt);
		///
		f.close();
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

		public int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
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