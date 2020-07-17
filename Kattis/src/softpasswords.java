import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class softpasswords {
	public static void main(String[] args) throws Exception {
		new softpasswords().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s = f.nextLine();
		String p = f.nextLine();
		out.println(solve(s, p) ? "Yes" : "No");
		///
		out.flush();
	}
	
	public boolean solve(String s, String p) {
		if(p.length() != s.length() && p.length() != s.length()-1) return false;
		
		//case 1
		if(s.equals(p)) return true;
		
		//case 2
		if(s.matches("\\d.*")) return true;
		
		//case 3
		if(s.matches(".*\\d")) return true;
		
		//case 4
		char[] c = p.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(Character.isUpperCase(c[i])) c[i] = Character.toLowerCase(c[i]);
			else c[i] = Character.toUpperCase(c[i]);
		}
		p = new String(c);
		return s.equals(p);
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