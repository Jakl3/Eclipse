import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class haypoints {
	public static void main(String[] args) throws Exception {
		new haypoints().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int m = f.nextInt(), n = f.nextInt();
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0; i < m; i++) {
			String s = f.next();
			int num = f.nextInt();
			map.put(s, num);
		}
		for(int i = 0; i < n; i++) {
			int score = 0;
			String s;
			while(!(s = f.nextLine()).equals(".")) {
				String[] li = s.split(" ");
				for(String item : li)
					score += ( map.get(item) == null ? 0 : map.get(item));
			}
			out.println(score);
		}
		//out.println(map);
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