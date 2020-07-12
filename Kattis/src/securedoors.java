import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class securedoors {
	public static void main(String[] args) throws Exception {
		new securedoors().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String op = f.next(), name = f.next();
			if(op.equals("entry")) {
				if(list.contains(name))
					out.printf("%s entered (ANOMALY)\n", name);
				else {
					out.printf("%s entered\n", name);
					list.add(name);
				}
			}
			else {
				if(list.contains(name)) {
					out.printf("%s exited\n", name);
					list.remove(list.indexOf(name));
				}
				else
					out.printf("%s exited (ANOMALY)\n", name);
			}
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