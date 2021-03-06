import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class delimitersoup {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new delimitersoup().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int len = f.nextInt();
		char[] in = f.nextLine().toCharArray();
		Stack<Character> stack = new Stack<Character>();
		boolean ok = true;
		for(int i = 0; i < len; i++) {
			char c = in[i];
			if(c == ' ') continue;
			if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					out.println(c + " " + i);
					ok = false;
					break;
				}
				else {
					char chk = stack.pop();
					if(chk != (c == ')' ? c-1 : c-2)) {
						out.println(c + " " + i);
						ok = false;
						break;
					}
				}
			}
			else stack.push(c);
		}
		if(ok) out.println("ok so far");
		///
		f.close();
		out.flush();
	}
	
	public int indexOf(char cha, char[] c, int start) {
		char close;
		for(int i = start; i < c.length; i++) {
			if(c[i] == cha) return i;
		}
		return -1;
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