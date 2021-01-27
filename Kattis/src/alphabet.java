import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class alphabet {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new alphabet().run();
	}

	public void run() throws Exception {
		/*FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		char[] in = f.nextLine().toCharArray();
		
		int curr = 0;
		for(int i = 0; i < in.length; i++) {
			if(in[i] )
		}
		
		
		out.println(maxLen);

		///
		f.close();
		out.flush();
*/	}

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