import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1399B {
	public static void main(String[] args) throws Exception {
		new CF1399B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int n = f.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int aMin = Integer.MAX_VALUE, bMin = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				int t = f.nextInt();
				a[i] = t;
				if(aMin > t) aMin = t;
			}
			for(int i = 0; i < n; i++) {
				int t = f.nextInt();
				b[i] = t;
				if(bMin > t) bMin = t;
			}
			
			long cnt = 0;
			for(int i = 0; i < n; i++) {
				int a1 = a[i] - aMin;
				int b1 = b[i] - bMin;
				if(a1 > 0 && b1 > 0) {
					cnt += Math.min(a1, b1);
					cnt += Math.abs(a1-b1);
				}
				else if(a1 > 0) cnt += a1;
				else if(b1 > 0) cnt += b1;
				//out.println(cnt + " " + a1 + " " + b1);
			}
			out.println(cnt);
			
			//out.println(aMin + " " + Arrays.toString(a));
			//out.println(bMin + " " + Arrays.toString(b));
			
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