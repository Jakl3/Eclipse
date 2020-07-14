import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1375D {
	public static void main(String[] args) throws Exception {
		new CF1375D().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int kase = f.nextInt();
		while(kase-->0) {
			int n = f.nextInt();
			int[] arr = new int[n];
			boolean[] pos = new boolean[n+1];
			int max = -1;
			for(int i = 0; i < n; i++) {
				int t = f.nextInt();
				arr[i] = t;
				pos[t] = true;
				if(t > max) max = t;
			}
			
			String o = "";
			int op = 0;

			while(!check(arr)) {
				int mex = -1;
				for(int i = 0; i < n; i++) {
					if(!pos[i]) {
						mex = i;
						break;
					}
				}
				if(mex == -1) {
					mex = max+1;
					max = max+1;
				}
				
				for(int i = 1; i < n; i++) {
					if(arr[i-1] < mex) {
						arr[i] = mex;
						o += i + " ";
						break;
					}
				}
			}
			
			System.out.println(o);
			
			out.println(Arrays.toString(arr));
			out.println();
		}
		///
		f.close();
		out.flush();
	}
	
	public boolean check(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) return false;
		}
		return true;
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

		public void close() throws IOException {
			reader.close();
		}
	}
}