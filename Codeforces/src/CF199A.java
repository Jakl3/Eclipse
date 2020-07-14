import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF199A {
	public static void main(String[] args) throws Exception {
		new CF199A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		long[] fib = new long[80];
		fib[1] = 1;
		for(int i = 2; i < 80; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		long n = f.nextLong();
		long[] l = solve(fib, n);
		//out.println(Arrays.toString(l));
		
		out.println(Arrays.equals(l, new long[] {0,0,0}) && n != 0? "I'm too stupid to solve this problem" :
			Arrays.toString(l).replaceAll("[\\[\\],]", ""));
		
		///
		out.flush();
	}
	
	public long[] solve(long[] arr, long sum) {
		long[] out = {0,0,0};
		for(int i = 0; i < arr.length; i++) {
			Set<Long> s = new HashSet<Long>();
			long curr_sum = sum - arr[i];
			for(int j = 0; j < arr.length; j++) {
				if(s.contains(curr_sum - arr[j])) {
					out = new long[] {arr[i], arr[j], curr_sum - arr[j]};
					return out;
				}
				s.add(arr[j]);
			}
		}
		return out;
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