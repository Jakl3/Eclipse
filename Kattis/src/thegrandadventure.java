import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class thegrandadventure {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new thegrandadventure().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int T = f.nextInt();
		while(T-->0) {
			char[] advn = f.nextLine().toCharArray();
			out.println(adventure(advn) ? "YES" : "NO");
		}
		
		///
		f.close();
		out.flush();
	}
	
	public boolean adventure(char[] advn) {
		Stack<Character> backpack = new Stack<>();
		for(char item : advn) {
			if(item == '.') continue;
			else if(item == '$') backpack.add('$');
			else if(item == '|') backpack.add('|');
			else if(item == '*') backpack.add('*');
			else if(item == 't') {
				if(backpack.isEmpty()) return false;
				char t = backpack.pop();
				if(t != '|') return false;
			}
			else if(item == 'b') {
				if(backpack.isEmpty()) return false;
				char t = backpack.pop();
				if(t != '$') return false;
			}
			else if(item == 'j') {
				if(backpack.isEmpty()) return false;
				char t = backpack.pop();
				if(t != '*') return false;
			}
		}
		if(!backpack.isEmpty()) return false;
		return true;
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