import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class funhouse {
	public static void main(String[] args) throws Exception {
		new funhouse().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int c = f.nextInt(), r = f.nextInt();
		int k = 1;
		while(!(r == 0 && c == 0)) {
			char[][] mat = new char[r][c];
			
			int sr = -1, sc = -1; //entrance
			for(int i = 0; i < r; i++) {
				mat[i] = f.nextLine().toCharArray();
				for(int j = 0; j < c; j++) if(mat[i][j] == '*') { sr = i; sc = j; };	
			}
			
			int dirx = 0, diry = 0;
			if(sr == 0) { dirx = 0; diry = 1; } //down
			if(sr == r-1) { dirx = 0; diry = -1; } //up
			if(sc == 0) { dirx = 1; diry = 0; } //right
			if(sc == c-1) { dirx = -1; diry = 0; } //left
			
			
			int cr = sr, cc = sc;
			while(mat[cr][cc] != 'x') {
				cr += diry;
				cc += dirx;
				
				if(mat[cr][cc] == '/') {
					if(dirx == 1) { dirx = 0; diry = -1; }
					else if(dirx == -1) { dirx = 0; diry = 1; }
					else if(diry == 1) { dirx = -1; diry = 0; }
					else if(diry == -1) { dirx = 1; diry = 0; }
				} else if(mat[cr][cc] == '\\') {
					if(dirx == 1) { dirx = 0; diry = 1; }
					else if(dirx == -1) { dirx = 0; diry = -1; }
					else if(diry == 1) { dirx = 1; diry = 0; }
					else if(diry == -1) { dirx = -1; diry = 0; }
				}
				
				//System.out.println(cr + " " + cc);
			}
			mat[cr][cc] = '&';
			out.println("HOUSE " + k++);
			for(int i = 0; i < r; i++) out.println(new String(mat[i]));
			
			
			c = f.nextInt(); r = f.nextInt();
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

		public int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
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