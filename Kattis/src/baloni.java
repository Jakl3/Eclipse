import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class baloni {
	public static void main(String[] args) throws Exception {
		new baloni().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = f.nextInt();
		int cnt = 1;
		List<Integer> arrows = new ArrayList<>();
		arrows.add(arr[0] - 1);
		for(int i = 1; i < n; i++) {
			if(arrows.contains(arr[i])) {
				arrows.remove(arrows.indexOf(arr[i]));
				arrows.add(arr[i]-1);
			}
			else {
				cnt++;
				arrows.add(arr[i]-1);
			}
		}
		out.println(cnt);
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