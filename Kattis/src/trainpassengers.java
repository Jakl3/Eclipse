import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class trainpassengers {
	public static void main(String[] args) throws Exception {
		new trainpassengers().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int C = f.nextInt(), n = f.nextInt();
		boolean ok = true;
		int curr = 0;
		for(int i = 0; i < n; i++) {
			int left = f.nextInt(), enter = f.nextInt(), wait = f.nextInt();
			
			if(left > curr) ok = false;
			
			curr += enter - left;
			
			if(curr < 0 || curr > C || (curr != C && wait != 0) || (i == n-1 && wait != 0)) ok = false;
				
				
		}
		
		if(curr != 0) ok = false;
		
		
		out.println(ok ? "possible":"impossible");
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