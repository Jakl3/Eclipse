import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF165A {
	public static void main(String[] args) throws Exception {
		new CF165A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		Pos[] arr = new Pos[n];
		for(int i = 0; i < n; i++) arr[i] = new Pos(f.nextInt(), f.nextInt());

		int cnt = 0;
		for(int i = 0; i < n; i++) {
			boolean up = false, down = false, left = false, right = false;
			Pos p1 = arr[i];
			for(int j = 0; j < n; j++) {
				Pos p2 = arr[j];
				if(p1.x == p2.x) {
					if(p1.y < p2.y) up = true;
					if(p1.y > p2.y) down = true; 
				}
				if(p1.y == p2.y) {
					if(p1.x < p2.x) right = true;
					if(p1.x > p2.x) left = true; 
				}
			}
			//out.println(p1 + " " + up + " " + down + " " + left + " " + right);
			if(up && down && left && right) cnt++;
		}
		out.println(cnt);
		///
		out.flush();
	}
	
	private class Pos {
		int x;
		int y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return x + ":" + y;
		}
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