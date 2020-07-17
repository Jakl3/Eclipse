import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class cetiri {
	public static void main(String[] args) throws Exception {
		new cetiri().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		List<Integer> list = new ArrayList<>();
		list.add(f.nextInt()); list.add(f.nextInt()); list.add(f.nextInt());
		Collections.sort(list);
		int r1 = list.get(2) - list.get(1), r2 = list.get(1) - list.get(0);
		
		if(r1 == r2) out.println(list.get(list.size()-1) + r1);
		else if(r1 < r2) out.println(list.get(0) + r1);
		else out.println(list.get(1) + r2);
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