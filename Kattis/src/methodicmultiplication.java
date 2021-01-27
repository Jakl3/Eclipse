import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class methodicmultiplication {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new methodicmultiplication().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		String a = f.nextLine();
		int a1 = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'S') a1++;
		}
		String b = f.nextLine();
		int b1 = 0;
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == 'S') b1++;
		}
		int res = a1*b1;
		if(res == 0) out.println(0);
		else {
			for(int i = 0; i < res; i++) {
				out.print("S(");
			}
			out.print(0);
			for(int i = 0; i < res; i++) {
				out.print(")");
			}
			out.println();
		}

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