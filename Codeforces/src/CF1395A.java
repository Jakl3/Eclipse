import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1395A {
	public static void main(String[] args) throws Exception {
		new CF1395A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int r = f.nextInt(), g = f.nextInt(), b = f.nextInt(), w = f.nextInt();
			if(check(r,g,b,w) || check(r-1,g-1,b-1,w+3)) out.println("Yes");
			else out.println("No");
		}
		///
		out.flush();
	}
	
	public boolean check(int r, int g, int b, int w) {
		if(r < 0 || g < 0 || b < 0 || w < 0) return false;
		int cnt = 0;
		if(r % 2 == 1) cnt++;
		if(g % 2 == 1) cnt++;
		if(b % 2 == 1) cnt++;
		if(w % 2 == 1) cnt++;
		return cnt <= 1;
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