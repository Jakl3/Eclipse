import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class CF1384C {
	public static void main(String[] args) throws Exception {
		new CF1384C().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int n = f.nextInt();
			char[] a = f.nextLine().toCharArray();
			char[] b = f.nextLine().toCharArray();
			char max = 0;
			
			for(int i = 0; i < n; i++) max = (char)Math.max(max, b[i]);
			boolean ok = true;
			for(int i = 0; i < n; i++) {
				if(a[i] == max && b[i] != a[i]) {
					ok = false;
					break;
				}
			}
			if(!ok) out.println(-1);
			else out.println(0);
			
			String rema = "" + a[0], remb = "" + b[0];
			for(int i = 1; i < n; i++) {
				System.out.println(rema + " " + remb);
				if(a[i] != rema.charAt(rema.length()-1)) rema += a[i];
				if(b[i] != remb.charAt(remb.length()-1)) remb += b[i];
			}
			out.println(rema);
			out.println(remb);
			out.println();
		}
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