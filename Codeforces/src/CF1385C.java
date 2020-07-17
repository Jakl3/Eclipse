import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1385C {
	public static void main(String[] args) throws Exception {
		new CF1385C().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) arr[n-1-i] = f.nextInt();
			out.println(n - solve(n,arr));
		}
		///
		out.flush();
	}
	
	public int solve(int n, int[] arr) {
		// has to either increase then decrease
		// or decrease
		if(n <= 1) return n;
		
		int first = -1;
		for(int i = 1; i < n; i++) if(arr[i] != arr[0]) { first = i; break;}
		if(first == -1) return n;
		
		if(arr[0] > arr[first]) {
			int i = 1;
			while(i < n-1 && arr[i] >= arr[i+1]) i++;
			return i+1;
		}
		else {
			int i = 1;
			while(i < n-1 && arr[i] <= arr[i+1]) i++;
			while(i < n-1 && arr[i] >= arr[i+1]) i++;
			return i+1;
		}
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