import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class completingthesquare {
	public static void main(String[] args) throws Exception {
		new completingthesquare().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		List<Pos> list = new ArrayList<>();
		for(int i = 0; i < 3; i++) list.add(new Pos(f.nextInt(), f.nextInt()));
		Collections.sort(list);
		out.println(list);
		
		
		
		///
		out.flush();
	}
	
	private class Pos implements Comparable<Pos> {
		int x;
		int y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(Pos p) {
			return Integer.compare(this.y, p.y);
		}
		public String toString() {
			return x + " " + y;
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