import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class videospeedup {
	public static void main(String[] args) throws Exception {
		new videospeedup().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt(), p = f.nextInt(), k = f.nextInt();
		int[] arr = new int[n+2];
		arr[0] = 0;
		for(int i = 0; i < n; i++) arr[i+1] = f.nextInt();
		arr[arr.length-1] = k;
		
		//out.println(Arrays.toString(arr));
		double len = 0;
		int i = arr.length-1;
		while(n >= 0) {
			double rate = 1 + n * (p/100.0);
			//out.println(n+ " "+rate);
			len += rate * (arr[i] - arr[i-1]);
			
			n--;
			i--;
			
		}
		out.println(len);
		
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