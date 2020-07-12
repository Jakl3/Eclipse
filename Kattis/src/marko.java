import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class marko {
	public static void main(String[] args) throws Exception {
		new marko().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		List<String> dict = new ArrayList<>();
		for(int i = 0; i < t; i++) dict.add(f.nextLine());
		char[] s = f.nextLine().toCharArray();
		Map<Integer, HashSet<Character>> map = new HashMap<Integer, HashSet<Character>>() {{
			put(2, new HashSet<Character>(Arrays.asList('a','b','c')));
			put(3, new HashSet<Character>(Arrays.asList('d','e','f')));
			put(4, new HashSet<Character>(Arrays.asList('g','h','i')));
			put(5, new HashSet<Character>(Arrays.asList('j','k','l')));
			put(6, new HashSet<Character>(Arrays.asList('m','n','o')));
			put(7, new HashSet<Character>(Arrays.asList('p','q','r','s')));
			put(8, new HashSet<Character>(Arrays.asList('t','u','v')));
			put(9, new HashSet<Character>(Arrays.asList('w','x','y','z')));
		}};
		
		for(int i = 0; i < s.length; i++) {
			int n = s[i] - '0';
			HashSet<Character> set = map.get(n);
			for(int j = dict.size()-1; j >= 0; j--) {
				if(!set.contains(dict.get(j).charAt(i))) dict.remove(j);
			}
		}
		out.println(dict.size());
		
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