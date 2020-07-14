import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1143A {
	public static void main(String[] args) throws Exception {
		new CF1143A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		int[] arr = Arrays.stream(f.nextLine().split(" ")).mapToInt(an -> Integer.parseInt(an)).toArray();
		out.println(Math.min(lastIndexOf(arr,1) + 1, lastIndexOf(arr,0) + 1));
		///
		out.flush();
	}
	
	public int lastIndexOf(int[] arr, int a) {
		for(int i = arr.length-1; i >= 0; i--) { 
			if(arr[i] == a)
				return i;
		}
		return -1;
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