import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1324B {
	public static void main(String[] args) throws Exception {
		new CF1324B().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < n; i++) list.add(f.nextInt());
			out.println(check(list) ? "YES" : "NO");
		}
		///
		out.flush();
	}
	
	public boolean check(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.lastIndexOf(list.get(i)) >= (i+2)) return true;
		}
		return false;
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