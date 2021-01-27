import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class heimavinna {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new heimavinna().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		String[] in = f.nextLine().split(";");
		int cnt = 0;
		for(String item : in) {
			String[] curr = item.split("-");
			if(curr.length == 1) cnt ++;
			else {
				cnt += Integer.parseInt(curr[1]) - Integer.parseInt(curr[0]) + 1;
			}
		}
		System.out.println(cnt);

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