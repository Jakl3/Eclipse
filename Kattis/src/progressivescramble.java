import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class progressivescramble {
	public static void main(String[] args) throws Exception {
		new progressivescramble().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			String s = f.nextLine();
			String op = s.substring(0,1);
			s = s.substring(2);
			
			int k = s.length();
			int[] n = new int[k];
			for(int i = 0; i < k; i++) {
				n[i] = s.charAt(i) - 'a' + 1;
				if(s.charAt(i) == ' ') n[i] = 0;
			}
			
			
			if(op.equals("e")) {
				for(int i = 1; i < k; i++) n[i] += n[i-1];
				for(int i = 1; i < k; i++) n[i] %= 27;
			} else {
				for(int i = 1; i < k; i++) {
					while(n[i] < n[i-1]) n[i] += 27;
				}
				for(int j = k-1; j > 0; j--) n[j] -= n[j-1];
			}
			
			char[] c = new char[k];
			for(int i = 0; i < k; i++) {
				if(n[i] == 0) c[i] = ' ';
				else c[i] = (char)(n[i]-1+'a');
			}
			out.println(new String(c));
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