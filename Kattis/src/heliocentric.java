import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class heliocentric {
	public static void main(String[] args) throws Exception {
		new heliocentric().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s;
		int i = 1;
		while((s=f.nextLine()) != null) {
			String[] in = s.split(" ");
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			int cnt = 0;
			while(a != 0 || b != 0) {
				a = (a + 1) % 365;
				b = (b + 1) % 687;
				cnt++;
			}
			out.printf("Case %d: %d\n", i++, cnt);
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