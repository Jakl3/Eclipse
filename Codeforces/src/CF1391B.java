import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1391B {
	public static void main(String[] args) throws Exception {
		new CF1391B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T=f.nextInt();
		while(T-->0) {
			int r = f.nextInt(), c = f.nextInt();
			char[][] mat = new char[r][c];
			for(int i = 0; i < r; i++) {
				mat[i] = f.nextLine().toCharArray();
			}
			
			int ans = 0;
			for(int i = 0; i < r; i++) {
				if(mat[i][c-1] == 'R') ans++;
			}
			for(int i = 0; i < c; i++) {
				if(mat[r-1][i] == 'D') ans++;
			}
			out.println(ans);
		}
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