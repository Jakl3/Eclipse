import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class amoebas {
	public static void main(String[] args) throws Exception {
		new amoebas().run();
	}
	
	static char[][] mat;
    static int ar, ac;
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1}, dy = {1, 1, 1, 0, -1, -1, -1, 0};
    
	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		ar = f.nextInt();
		ac = f.nextInt();
		mat = new char[ar][ac];
		for(int i = 0; i < ar; i++) mat[i] = f.nextLine().toCharArray();
		
		int cnt = 0;
		for(int i = 0; i < ar; i++) {
			for(int j = 0; j < ac; j++) {
				if(mat[i][j] == '#') {
					cnt++;
					solve(i,j);
				}
			}
		}
		out.println(cnt);
		///
		out.flush();
	}
	
	public void solve(int r, int c) {
		mat[r][c] = '.';
		for(int i = 0; i < 8; i++) {
			if(valid(r + dx[i], c + dy[i]))
				solve(r + dx[i], c + dy[i]);
		}
	}
	
	public boolean valid(int r, int c) {
		return(r >= 0 && r < ar && c >= 0 && c < ac && mat[r][c] == '#');
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