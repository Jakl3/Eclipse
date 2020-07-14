import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1375B {
	public static void main(String[] args) throws Exception {
		new CF1375B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int asdf = f.nextInt();
		while(asdf-->0) {
			int r = f.nextInt(), c = f.nextInt();
			int[][] orig = new int[r][c];
			int[][] copy = new int[r][c];
			
			boolean good = true;
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					orig[i][j] = f.nextInt();
					copy[i][j] =  4;
					if(i == 0 || i == r-1) copy[i][j]--;
					if(j == 0 || j == c-1) copy[i][j]--;
					if(copy[i][j] < orig[i][j]) good = false;
				}
			}
			if(good) {
				out.println("YES");
				for(int i = 0; i < r; i++) {
					for(int j = 0; j < c; j++) {
						out.print(copy[i][j] + " ");
					}
					out.println();
				}
			} else {
				out.println("NO");
			}
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