import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class plantingtrees {
	public static void main(String[] args) throws Exception {
		new plantingtrees().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) q.offer(f.nextInt());
		int days = 1;
		int res = 0;
		while(!q.isEmpty()) {
			res = Math.max(res, q.remove() + days++);
		}
		out.println(res+1);
		
		
		
		
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