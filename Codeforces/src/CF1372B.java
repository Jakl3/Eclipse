import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1372B {
	public static void main(String[] args) throws Exception {
		new CF1372B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			int p = -1;
			for(int i = 2; i * i <= n && p < 0; i++) {
				//out.println(i + " " + i);
				if(n % i == 0)
					p = i;
			}
			if(p < 0)
				p = n;
			out.println(n/p + " " + (n-(n/p)));
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

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}