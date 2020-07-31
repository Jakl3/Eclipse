import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1384A {
	public static void main(String[] args) throws Exception {
		new CF1384A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			int[] nums = new int[n];
			for(int i = 0; i < n; i++) nums[i] = f.nextInt();
			
			String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
			
			char[][] c = new char[n+1][s.length()];
			
			for(int i = 0; i < n; i++) {
				
				c[i] = s.toCharArray();
				c[i+1] = s.toCharArray();
				
				c[i+1][nums[i]] = c[i+1][nums[i]] == 'z' ? 'a' : (char)(c[i+1][nums[i]]+1);
				s = new String(c[i+1]);
			}
			
			for(char[] item : c) out.println(new String(item));
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