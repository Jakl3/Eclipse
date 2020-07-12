import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class amsterdamdistance {
	public static void main(String[] args) throws Exception {
		new amsterdamdistance().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int m = f.nextInt(), n = f.nextInt();
		double r = f.nextDouble();
		double ax = f.nextDouble(), ay = f.nextDouble(), bx = f.nextDouble(), by = f.nextDouble();
		
		double rslice = r/n;
		double mincirc = Math.min(ay, by);
		double dist = Math.abs(ax-bx);
		double circ = (mincirc * rslice * Math.PI * dist) / m;
		
		out.println(Math.min(circ + Math.abs(ay-by)*rslice, (ay + by) * rslice));
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