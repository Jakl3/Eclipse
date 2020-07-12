import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class bank {
	public static void main(String[] args) throws Exception {
		new bank().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt(), t = f.nextInt();
		ArrayList<Integer>[] bank = new ArrayList[t];
		for(int i = 0; i < t; i++) bank[i] = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int c = f.nextInt(), te = f.nextInt();
			//out.println(c + " " + te);
			bank[te].add(c);
		}
		
		//out.println(Arrays.toString(bank));
		
		int tot = 0;
		ArrayList<Integer> choices = new ArrayList<Integer>();

		for (int i = t - 1; i >= 0; i--) {
			choices.addAll(bank[i]);
			Collections.sort(choices);
			//out.println(choices);
			
			if (!choices.isEmpty())
				tot += choices.remove(choices.size() - 1);
			
		}
		out.println(tot);
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