import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1398A {
	public static void main(String[] args) throws Exception {
		new CF1398A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			int n = f.nextInt();
			int[] arr = f.readArray(n);
			Arrays.sort(arr);
			if(!check(arr[0],arr[1],arr[n-1])) {
				int[] asf= find(arr[0],arr[1],arr[n-1],arr);
				Arrays.sort(asf);
				out.printf("%d %d %d\n", asf[0]+1, asf[1]+1, asf[2]+1);
			}
			else out.println(-1);
		}
		///
		out.flush();
	}
	
	public int[] find(int a, int b, int c, int[] arr) {
		int[] pos = new int[3];
		Arrays.fill(pos, -1);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a && pos[0] == -1) pos[0] = i;
			else if(arr[i] == b && pos[1] == -1) pos[1] = i;
			else if(arr[i] == c && pos[2] == -1) pos[2] = i;
		}
		return pos;
	}
	
	public boolean check(int a, int b, int c) {
		return a + b > c && b + c > a && a + c > b;
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

		public int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
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