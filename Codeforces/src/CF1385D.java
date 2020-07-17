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
	
/*	public int check(String s, int n, char c) {
		if(s.length() == 1) 
			return s.charAt(0) == c ? 1 : 0;
		int cntfirst = 0, cntsec = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == c) {
				if(i < n/2) cntfirst++;
				else cntsec++;
			}
		}
		c++;
		return Math.max(cntfirst + check(s.substring(n/2), n/2, c), cntsec + check(s.substring(0,n/2), n/2, c));

		
	}*/
	
	public int check(String s, int n, char c) {
		if(s.length() == 1) return s.charAt(0) == c ? 1 : 0;
		
		String first = s.substring(0,n/2);
		String sec = s.substring(n/2);
		
		//System.out.println(n + " " + first + " " + sec);
		
		int firstC = 0, fi = 0, secC = 0, se = 0;
		for(int i = 0; i < n/2; i++) {
			if(first.charAt(i) == c) firstC++;
			if(sec.charAt((n/2)-1-i) == c) secC++;	
		}
		
		//System.out.println(c + " " + firstC + " " + secC);
		
		c++;
		
		fi = check(s.substring(0,n/2), n/2, c);
		se = check(s.substring(n/2), n/2, c);
		
		return Math.max(firstC + se, secC + fi);
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