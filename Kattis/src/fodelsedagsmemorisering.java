import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class fodelsedagsmemorisering {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new fodelsedagsmemorisering().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		int N = f.nextInt();
		
		Map<String, String[]> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			String[] in = f.nextLine().split(" ");
			if(map.containsKey(in[2])) {
				if(Integer.parseInt(map.get(in[2])[1]) < Integer.parseInt(in[1])) {
					map.put(in[2], new String[] {in[0],in[1]});
				}
			}
			else {
				map.put(in[2], new String[] {in[0],in[1]});
			}
		}
		
		List<String> t = new ArrayList<>();
		for(String item : map.keySet()) {
			t.add(map.get(item)[0]);
		}
		Collections.sort(t);
		System.out.println(t.size());
		for(String item : t) {
			System.out.println(item);
		}
		///
		f.close();
		out.flush();
	}

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