import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class greedilyincreasing {
	public static void main(String[] args) throws Exception {
		new greedilyincreasing().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = f.nextInt();
		int g = arr[0];
		List<Integer> list = new ArrayList<Integer>();
		list.add(g);
		for(int i = 1; i < n; i++) {
			if(arr[i] > g) {
				list.add(arr[i]);
				g = arr[i];
			}
		}
		out.println(list.size());
		out.println(list.toString().replaceAll("[\\[\\],]", ""));
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