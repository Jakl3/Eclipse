import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1380A {
	public static void main(String[] args) throws Exception {
		new CF1380A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) arr[i] = f.nextInt();
			out.println(solve(arr,n));
		
		}
		///
		out.flush();
	}
	
	public String solve(int[] arr, int n) {
		//for every num, look for 2 numbers less than it, check index
		for(int i = 0; i < n; i++) {
			int a = -1, b = -1;
			for(int j = 0; j < n; j++) {
				if(arr[j] < arr[i]) {
					if(j < i) a = j;
					else b = j;
				}
			}
			if(a == -1 || b == -1) continue;
			return "YES\n" + (a+1) + " " + (i+1) + " " + (b+1);
		}
		return "NO";
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