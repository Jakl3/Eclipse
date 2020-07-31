import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1364A {
	public static void main(String[] args) throws Exception {
		new CF1364A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt(), x = f.nextInt();
			int sum = 0;
			int l = -1, r = -1;
			for(int i=0;i<n;i++) {
				int te = f.nextInt();
				if(te % x != 0) {
					l = l == -1 ? i : l;
					r = i;
				}
				sum += te;
			}
			//out.println(l + " " + r);
			if(sum % x != 0) out.println(n);
			else if(l == -1) out.println(-1);
			else out.println(n - Math.min(l+1, n-r));
			
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