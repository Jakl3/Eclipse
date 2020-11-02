import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class conformity {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new conformity().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		int max = -1;
		
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0; i < T; i++) {
			int[] in = Arrays.asList(f.nextLine().split(" ")).stream().mapToInt(n -> Integer.parseInt(n)).toArray();
			Arrays.sort(in);
			String s = Arrays.toString(in);
			if(!map.containsKey(s)) map.put(s,0);
			int temp = map.get(s);
			map.put(s, temp+1);
			max = Math.max(max, temp+1);
		}
		
		int cnt = 0;
		for(String item : map.keySet()) {
			if(map.get(item) == max) cnt += max;
		}		
		out.println(cnt);
		
		
		
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