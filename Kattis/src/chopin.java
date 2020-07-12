import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class chopin {
	public static void main(String[] args) throws Exception {
		new chopin().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int cases = 1;
		String s = null;
		while( (s = f.nextLine()) != null) {
			String[] spl = s.split(" ");
			if(spl[0].length() == 1) out.printf("Case %d: %s\n", cases, "UNIQUE");
			else {
				char[] l = spl[0].toCharArray();
				if(l[1] == 'b') {
					l[1] = '#';
					if(l[0] == 'A') l[0] = 'G';
					else l[0]--;
				}
				else {
					l[1] = 'b';
					if(l[0] == 'G') l[0] = 'A';
					else l[0]++;
				}
				spl[0] = new String(l);
				
				out.printf("Case %d: %s\n", cases, spl[0] + " " + spl[1]);
			}
			cases++;
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