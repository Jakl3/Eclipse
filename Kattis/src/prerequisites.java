import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class prerequisites {
	public static void main(String[] args) throws Exception {
		new prerequisites().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s;
		while((s = f.nextLine()) != null) {
			String[] split = s.split(" ");
			int k = Integer.parseInt(split[0]);
			if(k == 0) break;
			int m = Integer.parseInt(split[1]);
			List<Integer> courses = new ArrayList<Integer>();
			for(int i = 0; i < k; i++) courses.add(f.nextInt());
			boolean good = true;
			for(int i = 0; i < m; i++) {
				int c = f.nextInt(), r = f.nextInt();
				List<Integer> cr = new ArrayList<Integer>();
				for(int j = 0; j < c; j++) {
					cr.add(f.nextInt());
				}
				cr.retainAll(courses);
				if(cr.size() < r) good = false;
			}
			out.println(good ? "yes" : "no");
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

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}