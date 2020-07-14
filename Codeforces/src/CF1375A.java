import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1375A {
	public static void main(String[] args) throws Exception {
		new CF1375A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int kase = f.nextInt();
		while(kase-->0) {
			int n = f.nextInt();
			int[] num = new int[n];
			for(int i = 0; i < n; i++) {
				int t = Math.abs(f.nextInt());
				if(i % 2 == 1) num[i] = -t;
				else num[i] = t;
			}
			
			out.println(Arrays.toString(num).replaceAll("[\\[\\],]",""));
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