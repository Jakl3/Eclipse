import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class patuljci {
	public static void main(String[] args) throws Exception {
		new patuljci().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int[] n = new int[9];
		int tot = 0;
		for(int i = 0; i < 9; i++) {
			int t = f.nextInt();
			//out.println(t);
			n[i] = t;
			tot += t;
		}
		tot -= 100;
		//out.println("TOT" + tot);
		boolean cont = true;
		for(int i = 0; i < 9 && cont; i++) {
			for(int j = i+1; j < 9 && cont; j++) {
				if(n[i] + n[j] == tot) {
					n[i] = -1;
					n[j] = -1;
					for(int k = 0; k < 9; k++) {
						if(n[k] != -1) out.println(n[k]);
					}
					cont = false;
				}
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