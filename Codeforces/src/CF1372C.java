import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1372C {
	public static void main(String[] args) throws Exception {
		new CF1372C().run();
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
			
			int i = 0, j = n-1;
			while(i < n-1 && arr[i] < arr[i+1]) i++;
			while(j > 0 && arr[j] > arr[j-1]) j--;
			
			if(j < i) out.println(0);
			else {
				int cnt = 1;
				for(int a = i; a <= j; a++) {
					if(arr[a] == a+1) cnt++;
				}
				out.println(Math.min(cnt, 2));
			}
			
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