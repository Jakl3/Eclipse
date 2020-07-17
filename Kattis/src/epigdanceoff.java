import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class epigdanceoff {
	public static void main(String[] args) throws Exception {
		new epigdanceoff().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt(), m = f.nextInt();
		char[][] mat = new char[n][m];
		for(int i = 0; i < n; i++) mat[i] = f.nextLine().toCharArray();
		
		int cnt = 1;
		for(int i = 0; i < m; i++) {
			boolean ok = true;
			for(int j = 0; j < n; j++) {
				if(mat[j][i] != '_') {
					ok = false;
					break;
				}
			}
			if(ok) cnt++;
		}
		out.println(cnt);
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