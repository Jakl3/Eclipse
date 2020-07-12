import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class peg {
	public static void main(String[] args) throws Exception {
		new peg().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		char[][] mat = new char[7][7];
		for(int i = 0; i < 7; i++) {
			mat[i] = f.nextLine().toCharArray();
			//out.println(Arrays.toString(mat[i]));
		}
		int cnt = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(mat[i][j] == ' ' || mat[i][j] == 'o') continue;
				if(inRange(i-2, j, mat))
					if(mat[i-1][j] == 'o' && mat[i-2][j] == 'o') cnt++;
				if(inRange(i+2, j, mat))
					if(mat[i+1][j] == 'o' && mat[i+2][j] == 'o') cnt++;
				if(inRange(i, j-2, mat))
					if(mat[i][j-1] == 'o' && mat[i][j-2] == 'o') cnt++;
				if(inRange(i, j+2, mat))
					if(mat[i][j+1] == 'o' && mat[i][j+2] == 'o') cnt++;
			}
		}
		out.println(cnt);
		///
		out.flush();
	}
	
	public boolean inRange(int r, int c, char[][] mat) {
		return(r >= 0 && r < 7 && c >= 0 && c < 7);
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