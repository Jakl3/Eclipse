import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1385D {
	public static void main(String[] args) throws Exception {
		new CF1385D().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			String s = f.nextLine();
			System.out.println(n - check(s, n, 'a'));
			
		}
		///
		out.flush();
	}
	
	public int check(String s, int n, char c) {
		if(s.length() == 1) return s.charAt(0) == c ? 1 : 0;
		
		String first = s.substring(0,n/2);
		String sec = s.substring(n/2);
		
		int frontC = 0, backC = 0;
		for(int i = 0; i < n/2; i++) {
			if(first.charAt(i) == c) frontC++;
			if(sec.charAt((n/2)-1-i) == c) backC++;	
		}
		
		c++;
		int fi = check(s.substring(0,n/2), n/2, c);
		int se = check(s.substring(n/2), n/2, c);
		
		return Math.max(frontC + se, backC + fi);
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