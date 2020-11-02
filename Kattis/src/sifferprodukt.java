import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class sifferprodukt {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new sifferprodukt().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		while(n/10 != 0) {
			n = digitProduct(n);
			//out.println(n);
		}
		out.println(n);
		///
		f.close();
		out.flush();
	}
	
	public int digitProduct(int n) {
		int t = 1;
		while(n != 0) {
			
			if(n % 10 != 0) t *= n%10;
			n/=10;
		}
		return t;
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