import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class vacuumba {
	public static void main(String[] args) throws Exception {
		new vacuumba().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int m = f.nextInt();
			double x = 0, y = 0;
			double prev = 0;
			for(int i = 0; i < m; i++) {
				double ang = f.nextDouble(), dist = f.nextDouble();
				ang = -ang;

				ang = (ang + prev) % 360;
				
				x += dist * Math.sin(Math.toRadians(ang));
				y += dist * Math.cos(Math.toRadians(ang));
				//out.println(ang + " " + dist + " " + x + " " + y);
				
				prev = ang;
			}
			out.printf("%.10f %.10f\n", x, y);
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