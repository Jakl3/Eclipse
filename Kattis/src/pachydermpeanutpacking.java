import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class pachydermpeanutpacking {
	public static void main(String[] args) throws Exception {
		new pachydermpeanutpacking().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s;
		while((s = f.nextLine()) != null) {
			int n = Integer.parseInt(s);
		}
		///
		out.flush();
	}
	
	private class Box {
		int x1, x2, y1, y2;
		public Box(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
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