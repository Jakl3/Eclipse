import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class raggedright {
	public static void main(String[] args) throws Exception {
		new raggedright().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int score = 0, max = 0;
		List<Integer> list = new ArrayList<>();
		String s = null;
		while((s = f.nextLine()) != null) {
			int n = s.length();
			list.add(n);
			if(n > max) max = n;
		}
		
		for(int i = 0; i < list.size()-1; i++) {
			int m = list.get(i);
			score += (max-m) * (max-m);
		}
		out.println(score);
		
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