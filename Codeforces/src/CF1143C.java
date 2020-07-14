import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1143C {
	public static void main(String[] args) throws Exception {
		new CF1143C().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		boolean[] arr = new boolean[n];
		//false = can remove, true = cant remove
		for(int i = 0; i < n; i++) {
			int parent = f.nextInt();
			int resp = f.nextInt();
			
			if(resp == 0)
				arr[i] = true;
			
			if(parent != -1)
				arr[parent-1] = resp == 0 ? true : arr[parent-1];
			
		}
		
		boolean good = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == false) {
				out.print((i+1) + " ");
				good = true;
			}
		}
		out.println(!good ? -1 : "");
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