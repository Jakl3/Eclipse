import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class nineknights {
	public static void main(String[] args) throws Exception {
		new nineknights().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
        char[][] mat = new char[5][5];
        for(int i = 0; i < 5; i++) mat[i] = f.nextLine().toCharArray();
        
        out.println(solve(mat));
		///
		out.flush();
	}
	int[] dr = {2, 2, -2, -2, 1, 1, -1, -1};
    int[] dc = {1, -1, 1, -1, 2, -2, 2, -2};

	public String solve(char[][] mat) {
		int kni = 0;
		for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 5; j++) {
        		if(mat[i][j] != 'k') continue;
        		kni++;
        		for(int k = 0; k < 8; k++) {
        			int nextr = i + dr[k];
        			int nextc = j + dc[k];
        			if(inRange(nextr,nextc) && mat[nextr][nextc] == 'k')
        				return "invalid";
        				
        		}
        	}
        }
		return kni == 9 ? "valid" : "invalid";
	}
	
	public boolean inRange(int r, int c) {
		return r < 5 && r >= 0 && c < 5 && c >= 0;
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