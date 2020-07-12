import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class mosquito {
	public static void main(String[] args) throws Exception {
		new mosquito().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String se;
		while((se = f.nextLine()) != null) {
			String[] t = se.split(" ");
			int m = Integer.parseInt(t[0]), p = Integer.parseInt(t[1]), l = Integer.parseInt(t[2]), 
					e = Integer.parseInt(t[3]), r = Integer.parseInt(t[4]),
					s = Integer.parseInt(t[5]), n = Integer.parseInt(t[6]);
			for(int i = 0; i < n; i++) {
				int newlar = e * m;
				int newpup = l/r;
				int newmos = p/s;
				l = newlar;
				p = newpup;
				m = newmos;
			}
			out.println(m);
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