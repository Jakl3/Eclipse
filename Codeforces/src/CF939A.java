import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class CF939A {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new CF939A().run();
	}
	
	int[] arr;
	int n;
	
	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		n = f.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = f.nextInt()-1;
		}
		
		System.out.println(solve() ? "YES" : "NO");
		
		

		///
		f.close();
		out.flush();
	}
	
	boolean solve() {
		for(int i = 0; i < n; i++) {
			if(arr[arr[arr[i]]] == i)
				return true;
		}
		return false;
	}

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

		public void close() throws IOException {
			reader.close();
		}
	}
}