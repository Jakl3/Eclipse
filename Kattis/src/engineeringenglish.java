import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class engineeringenglish {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new engineeringenglish().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		HashSet<String> word = new HashSet<>();
		String str;
		while((str=f.nextLine())!=null) {
			String[] s = str.split(" ");
			for(int i = 0; i < s.length; i++) {
				if(word.add(s[i].toLowerCase()) == false) s[i] = ".";
			}
			System.out.println(String.join(" ", s));
		}
		///
		f.close();
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

		public void close() throws IOException {
			reader.close();
		}
	}
}