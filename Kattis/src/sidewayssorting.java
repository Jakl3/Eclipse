import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class sidewayssorting {
	public static void main(String[] args) throws Exception {
		new sidewayssorting().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		while(true) {
			int r = f.nextInt(), c = f.nextInt();
			if(r == 0 && c == 0) break;
			
			String[] words = new String[c];
			for(int i = 0; i < c; i++) words[i] = "";
			for(int i = 0; i < r; i++) {
				String s = f.nextLine();
				for(int j = 0; j < c; j++) {
					words[j] += s.charAt(j);
				}
			}
			Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					out.print(words[j].charAt(i));
				}
				out.println();
			}
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