import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class flowlayout {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new flowlayout().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out, true);
		///
		
		while(true) {
			int maxW = f.nextInt();
			if(maxW == 0) break;
			
			int resW = 0, resH = 0;
			int currW = 0, maxCurrH = 0;
			while(true) {
				int w = f.nextInt(), h = f.nextInt();
				if(w+h == -2) break;
				
				
				if(w + currW > maxW) {
					resW = Math.max(resW, currW);
					currW = w;
					resH += maxCurrH;
					maxCurrH = h;
				}
				else {
					currW += w;
					maxCurrH = Math.max(maxCurrH, h);
				}
				
			}
			
			resH += maxCurrH;
			resW = Math.max(resW, currW);
			out.println(resW + " x " + resH);

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