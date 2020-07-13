import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class pivot {
	public static void main(String[] args) throws Exception {
		new pivot().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = f.nextInt();
		
		int[] max_left = new int[n];
		max_left[0] = arr[0];
		for(int i = 1; i < n; i++) {
			max_left[i] = Math.max(arr[i], max_left[i-1]);
		}
		//out.println(Arrays.toString(max_left));
		
		int[] min_right = new int[n];
		min_right[n-1] = arr[n-1];
		for(int i = n-2; i >= 0; i--) {
			min_right[i] = Math.min(arr[i], min_right[i+1]);
		}
		//out.println(Arrays.toString(min_right));
		
		int cnt = 0;
		if(arr[0] < min_right[1]) cnt++;
		if(arr[n-1] > max_left[n-2]) cnt++;
		
		for(int i = 1; i < n-1; i++) {
			if(arr[i] < min_right[i+1] && arr[i] > max_left[i-1]) cnt++;
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