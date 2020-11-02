import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class yoda {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new yoda().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		char[] a = new StringBuilder(f.nextLine()).reverse().toString().toCharArray();
		char[] b = new StringBuilder(f.nextLine()).reverse().toString().toCharArray();
		
		int len = Math.min(a.length, b.length);
		
		for(int i = 0; i < len; i++) {
			if(a[i] < b[i]) a[i] = '-';
			if(a[i] > b[i]) b[i] = '-';
		}
		String nA = new StringBuilder(new String(a).replaceAll("-","")).reverse().toString();
		String nB = new StringBuilder(new String(b).replaceAll("-","")).reverse().toString();
		out.println(nA.equals("") ? "YODA" : Integer.parseInt(nA));
		out.println(nB.equals("") ? "YODA" : Integer.parseInt(nB));
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