import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class billiard {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new billiard().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		while (true) {
			int a = f.nextInt(), b = f.nextInt(), s = f.nextInt(), m = f.nextInt(), n = f.nextInt();
			if(a+b+s+m+n == 0) break;
			
			double x = a * m;
			double y = b * n;
			
			double angle = Math.atan(y/x) * 180/Math.PI;
			double dist = Math.sqrt(y*y + x*x);
			
			out.printf("%.2f %.2f\n",angle,dist/s);
			
		}

		///
		f.close();
		out.flush();
	}

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