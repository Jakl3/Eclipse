import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class oktalni {
	public static void main(String[] args) throws Exception {
		new oktalni().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		out.println(conv(f.nextLine()));
		///
		out.flush();
	}
	
	public String conv(String s) {
		while(s.length() % 3 != 0)
			s = 0 + s;
		String out = "";
		for(int i = 0; i < s.length(); i+=3) {
			String chnk = s.substring(i,i+3);
			out += Integer.parseInt(chnk,2);
		}
		return out;
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