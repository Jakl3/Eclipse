import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1371C {
	public static void main(String[] args) throws Exception {
		new CF1371C().run();
	}

	public void run() throws Exception {
		FastScanner file = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int kase = file.nextInt();
		while(kase-->0) {
			long a = file.nextLong(), b = file.nextLong(), n = file.nextLong(), m = file.nextLong();
			
			boolean works = true;
			if( (a + b) < (n + m)) {
				works = false;
			} else {
				if(Math.min(a, b) < m) works = false;
			}
			
			out.println(works ? "Yes" : "No");
			
			/*long temp = a - b;
			temp--;
			if(temp < 0) temp = 0;
			a -= temp;
			n -= temp;
			
			a -= m;
			b -= n;
			
			out.println(a >= 0 && b >= 0 ? "Yes" : "No");
			
			//out.println();
*/			
			
			
			
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

		public void close() throws IOException {
			reader.close();
		}
	}
}