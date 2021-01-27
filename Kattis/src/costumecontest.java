import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class costumecontest {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new costumecontest().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		int N = f.nextInt();
		Map<String,Integer> map = new HashMap<>();
		while(N-->0) {
			String s = f.nextLine();
			if(!map.containsKey(s)) {
				map.put(s, 0);
			}
			map.put(s, map.get(s)+1);
		}
		List<String> list = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for(String item : map.keySet()) {
			if(map.get(item) < min) {
				list = new ArrayList<>();
				list.add(item);
				min = map.get(item);
			}
			else if(map.get(item) == min) {
				list.add(item);
			}
		}
		Collections.sort(list);
		for(String item : list) {
			out.println(item);
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