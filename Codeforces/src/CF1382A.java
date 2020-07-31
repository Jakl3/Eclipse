import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1382A {
	public static void main(String[] args) throws Exception {
		new CF1382A().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int a = f.nextInt(), b = f.nextInt();
			Set<Integer> ha = new HashSet<>();
			for(int i=0;i<a;++i) ha.add(f.nextInt());
			boolean found = false;
			int hold = -1;
			for(int i=0;i<b;++i) {
				int te = f.nextInt();
				if(ha.contains(te)) {
					if(!found) hold = te;
					found = true;
				}
			}
			if(found) {
				out.println("YES");
				out.println("1 " + hold);
			}
			else {
				out.println("NO");
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