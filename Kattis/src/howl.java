import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class howl {
	public static void main(String[] args) throws Exception {
		new howl().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextLine().length();
		ArrayList<Character> list = new ArrayList<>();
		list.add('A'); list.add('H'); list.add('O'); list.add('W');
		
		
		int k = list.size();
		while(k <= n) {
			if(k % 2 == 0) list.add('O');
			else list.add('W');
			k++;
		}
		out.println(new String(toArray(list)));
				
		
		///
		out.flush();
	}
	
	public char[] toArray(ArrayList<Character> list) {
		char[] out = new char[list.size()];
		for(int i = 0; i < list.size(); i++) out[i] = list.get(i);
		return out;
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