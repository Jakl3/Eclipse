import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class okviri {
	public static void main(String[] args) throws Exception {
		new okviri().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		char[] a = f.nextLine().toCharArray();
		int n = 5 * a.length - (a.length-1);
		char[][] mat = new char[5][n];
		
		int s = 0;
		for(int i = 0; i < a.length; i++) {
			
			int e = 2;
			for(int j = 0; j < 3; j++) {
				for(int k = s; k < s+5; k++) {
					if(mat[j][k] != '*' && mat[j][k] != '#') mat[j][k] = '.';
				}
				char c = '#';
				if((i+1) % 3 == 0) c = '*';
				if(mat[j][s+4-e] != '*') mat[j][s+4-e] = c;
				if(mat[j][s+e] != '*') mat[j][s+e] = c;
				e--;
			}
			e+=2;
			
			for(int j = 3; j < 5; j++) {
				for(int k = s; k < s+5; k++) {
					if(mat[j][k] != '*' && mat[j][k] != '#') mat[j][k] = '.';
				}
				char c = '#';
				if((i+1) % 3 == 0) c = '*';
				if(mat[j][s+4-e] == '.') mat[j][s+4-e] = c;
				if(mat[j][s+e] == '.') mat[j][s+e] = c;
				e++;
			}
			s+=4;

		}
		
		s = 2;
		for(int i = 0; i < a.length; i++) {
			mat[2][s] = a[i];
			s += 4;
		}
		
		for(int i = 0; i < 5; i++) out.println(new String(mat[i]));
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