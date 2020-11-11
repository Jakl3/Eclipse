import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class height {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new height().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int ck = f.nextInt();
			int[] nums = f.readArray(20);
			
			int cnt = 0;
			for(int i = 1; i < 20; i++) {
				int temp = nums[i];
				int j = i-1;
				while(j>=0 && nums[j] > temp) {
					nums[j+1] = nums[j];
					j--;
					cnt++;
				}
				nums[j+1] = temp;
			}
			
			out.println(ck + " " + cnt);
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