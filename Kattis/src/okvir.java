import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class okvir {
	public static void main(String[] args) throws Exception {
		new okvir().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int m = f.nextInt(), n = f.nextInt();
		int u = f.nextInt(), l = f.nextInt(), r = f.nextInt(), d = f.nextInt();
		
		char[][] mat = new char[m + u + d][n + l + r];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(j % 2 == i % 2) mat[i][j] = '#';
				else mat[i][j] = '.';
			}
			//out.println(new String(mat[i]));
		}
		
		for(int i = 0; i < m; i++) {
			char[] c = f.nextLine().toCharArray();
			for(int j = l; j < l+n; j++) {
				mat[i+u][j] = c[j-l];
			}
		}
		
		for(int i = 0; i < mat.length; i++) out.println(new String(mat[i]));
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