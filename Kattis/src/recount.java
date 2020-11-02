import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class recount {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new recount().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		Map<String,Integer> map = new HashMap<String,Integer>();
		int max = 0;
		String save = "";
		String s;
		while(!(s=f.nextLine()).equals("***")) {
			if(!map.containsKey(s)) map.put(s, 0);
			int t = map.get(s);
			map.put(s, t+1);
			if(t > max) {
				max = t;
				save = s;
			}
			else if(t == max) {
				save = "";
			}
		}
		
		out.println(save.equals("") ? "Runoff!" : save);
		///
		f.close();
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

		public void close() throws IOException {
			reader.close();
		}
	}
}