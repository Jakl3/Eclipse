import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class mia {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new mia().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		String s;
		while(!(s=f.nextLine()).equals("0 0 0 0")) {
			int a1 = s.charAt(0)-'0';
			int a2 = s.charAt(2)-'0';
			int b1 = s.charAt(4)-'0';
			int b2 = s.charAt(6)-'0';
			
			String a = "" + a1 + a2;
			String b = "" + b1 + b2;
			
			int aVal = 0, bVal = 0;
			if(a.equals("21") || a.equals("12")) aVal = 1000;
			else if(a1 == a2) aVal = 100+a1;
			else aVal = Integer.parseInt("" + Math.max(a1,a2) + Math.min(a1, a2));
			
			if(b.equals("21") || b.equals("12")) bVal = 1000;
			else if(b1 == b2) bVal = 100+b1;
			else bVal = Integer.parseInt("" + Math.max(b1,b2) + Math.min(b1, b2));
			
			out.println(bVal > aVal ? "Player 2 wins." : aVal > bVal ? "Player 1 wins." : "Tie.");
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