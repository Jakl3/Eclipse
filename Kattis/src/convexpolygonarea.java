import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class convexpolygonarea {
	public static void main(String[] args) throws Exception {
		new convexpolygonarea().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int s = f.nextInt();
			List<Pt> list = new ArrayList<>();
			for(int i = 0; i < s; i++) {
				list.add(new Pt(f.nextInt(),f.nextInt()));
			}
			list.add(list.get(0));
			double d1 = 0, d2 = 0;
			for(int i = 0; i < s; i++) {
				d1 += list.get(i).x * list.get(i+1).y;
				d2 += list.get(i).y * list.get(i+1).x;
			}
			out.println(.5 * (d1 - d2));
			
		}
		///
		out.flush();
	}
	
	private class Pt {
		int x;
		int y;
		public Pt(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return "(" + x + "," + y + ")";
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