import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class egypt {
	public static void main(String[] args) throws Exception {
		new egypt().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int a = f.nextInt(), b = f.nextInt(), c = f.nextInt();
		while(!(a == 0 && b == 0 && c == 0)) {
			List<Integer> list = new ArrayList<>();
			list.add(a); list.add(b); list.add(c); Collections.sort(list);
			a = list.get(0); b = list.get(1); c = list.get(2);
			out.println(a * a + b * b == c * c ? "right" : "wrong");
			a = f.nextInt(); b = f.nextInt(); c = f.nextInt();
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