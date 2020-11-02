import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1399A {
	public static void main(String[] args) throws Exception {
		new CF1399A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int n = f.nextInt();
			int[] nums = f.readArray(n);
			Arrays.sort(nums);
			out.println(check(nums) ? "YES" : "NO");
		}
		///
		out.flush();
	}
	
	public boolean check(int[] nums) {
		int n = nums.length;
		for(int i = 1; i < n; i++) {
			if(Math.abs(nums[i] - nums[i-1]) > 1) return false;
		}
		return true;
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
	}
}