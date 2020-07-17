import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class friday {
	public static void main(String[] args) throws Exception {
		new friday().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();		
		while(t-->0) {
			int d = f.nextInt(), m = f.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < m; i++) {
				int days = f.nextInt();
				for(int j = 1; j <= days; j++) list.add(j);
			}
			//out.println(list);
			
			int cnt = 0;
			//0 = sun, 1 = mon, 2 = tues, 3 = wed, 4 = thurs, 5 = fri, 6 = sat
			for(int i = 0; i < d; i++)
				if(list.get(i) == 13 && i % 7 == 5) cnt++;
			out.println(cnt);
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