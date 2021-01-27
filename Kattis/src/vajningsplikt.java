import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class vajningsplikt {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new vajningsplikt().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		
		String[] in = f.nextLine().split(" ");
		if(in[0].equals("South")) {
			if(in[1].equals("West") && (in[2].equals("East") || in[2].equals("North"))) {
				out.println("Yes");
			}
			else if(in[1].equals("North") && in[2].equals("East")) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
		}
		else if(in[0].equals("North")) {
			if(in[1].equals("East") && (in[2].equals("West") || in[2].equals("South"))) {
				out.println("Yes");
			}
			else if(in[1].equals("South") && in[2].equals("West")) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
		}
		
		else if(in[0].equals("West")) {
			if(in[1].equals("North") && (in[2].equals("South") || in[2].equals("East"))) {
				out.println("Yes");
			}
			else if(in[1].equals("East") && in[2].equals("South")) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
		}
		else if(in[0].equals("East")) {
			if(in[1].equals("South") && (in[2].equals("North") || in[2].equals("West"))) {
				out.println("Yes");
			}
			else if(in[1].equals("West") && in[2].equals("North")) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
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