import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class exam {
	public static void main(String[] args) throws Exception {
		new exam().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int fcor = f.nextInt();
		char[] a = f.nextLine().toCharArray();
		char[] b = f.nextLine().toCharArray();
		int fwro = a.length - fcor;
		
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b[i] && fcor > 0) {
				cnt++;
				fcor--;
			}
			else if(a[i] != b[i] && fwro > 0) {
				cnt++;
				fwro--;
			}
		}
		out.println(cnt);
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