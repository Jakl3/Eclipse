import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class polymul1 {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new polymul1().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int n1 = f.nextInt();
			int[] nums1 = f.readArray(n1+1);
			int n2 = f.nextInt();
			int[] nums2 = f.readArray(n2+1);
			
			int[] res = new int[n1+n2+1];
			for(int i = 0; i < n1+1; i++) {
				for(int j = 0; j < n2+1; j++) {
					res[j+i] = res[j+i] + nums1[i] * nums2[j];
				}
			}
			
			out.println(n1+n2);
			out.print(res[0]);
			for(int i = 1; i < n1+n2+1; i++) {
				out.print(" " + res[i]);
			}
			out.println();
		}
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