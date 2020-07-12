import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class sortofsorting {
	public static void main(String[] args) throws Exception {
		new sortofsorting().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s;
		while((s = f.nextLine()) != null) {
			int n = Integer.parseInt(s);
			if(n == 0) break;
			List<String> list = new ArrayList<>();
			for(int i = 0; i < n; i++) list.add(f.nextLine());
			Collections.sort(list, new Comparator<String>() {
				public int compare(String s1, String s2) {
					int n = Integer.compare(s1.charAt(0), s2.charAt(0));
					if(n == 0) {
						n = Integer.compare(s1.charAt(1), s2.charAt(1));
						return n;
					}
					return n;
				}
			});
			for(String se : list) out.println(se);
			out.println();
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