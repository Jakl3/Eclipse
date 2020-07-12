import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class semafori {
	public static void main(String[] args) throws Exception {
		new semafori().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt(), l = f.nextInt();
		int time = 0;
		int lastd = 0;
		for(int i = 0; i < n; i++) {
			int d = f.nextInt(), r = f.nextInt(), g = f.nextInt();
			time += d - lastd;
			int cyc = time / (r+g);
			int ready = cyc * (r+g) + r;
			//out.println("AAAAAAAAAAAAAA " + time + " " + cyc + " " + ready);
			while(time < ready) time++;
			//out.println("BBBBBBBBBB " + time + " " + cyc + " " + ready);
			lastd = d;
		}
		time += l - lastd;
		out.println(time);
		
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