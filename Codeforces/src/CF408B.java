import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF408B {
	public static void main(String[] args) throws Exception {
		new CF408B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		
		char[] c = f.nextLine().toCharArray();
		
		int[] sumfst = new int[26];
		int[] sumsec = new int[26];
		
		for(char cc : c) {
			sumfst[cc - 'a']++;
		}
		
		c = f.nextLine().toCharArray();
		for(char cc : c) {
			sumsec[cc - 'a']++;
		}
		
		int tot = 0;
		for(int i = 0; i < 26; i++) {
			if(sumfst[i] == 0 && sumsec[i] != 0) {
				tot = -1;
				break;
			} else tot += Math.min(sumfst[i], sumsec[i]);
		}
		out.println(tot);

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