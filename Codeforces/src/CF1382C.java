import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1382C {
	public static void main(String[] args) throws Exception {
		new CF1382C().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			String as = f.nextLine(), bs = f.nextLine();
			if(as.equals(bs)) { out.println(0); continue; }
			char[] a = as.toCharArray();
			char[] b = bs.toCharArray();
			
			
			List<Integer> aMoves = new ArrayList<>();
			int i = 1;
			while(i < n) {
				if(a[i] != a[i-1]) aMoves.add(i);
				i++;
			}
			if(a[n-1] == '1') aMoves.add(n);
			
			List<Integer> bMoves = new ArrayList<>();
			i = 1;
			while(i < n) {
				if(b[i] != b[i-1]) bMoves.add(i);
				i++;
			}
			if(b[n-1] == '1') bMoves.add(n);
			Collections.reverse(bMoves);
			
			int len = aMoves.size() + bMoves.size();
			out.print(len);
			for(int item : aMoves) out.print(" " + item);
			for(int item : bMoves) out.print(" " + item);
			out.println();
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