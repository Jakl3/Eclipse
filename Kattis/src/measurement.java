import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class measurement {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new measurement().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		// index 0 = th, 1 = in, 2 = ft, 3 = yd, 4 = ch, 5 = fur, 6 = mi, 7 = lea
		double[][] conversions = new double[8][8];
		double[] rates = {1000,12,3,22,10,8,3};
		conversions[0][0] = 1;
		for(int i = 1; i < 8; i++) {
			conversions[0][i] = conversions[0][i-1] / rates[i-1];
		}
		for(int i = 1; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				conversions[i][j] = conversions[i-1][j] * rates[i-1];
			}
		}
		String[] in = f.nextLine().split(" ");
		int num = Integer.parseInt(in[0]);
		int from = conv(in[1]);
		int to = conv(in[3]);
		out.println(num * conversions[from][to]);
		///
		f.close();
		out.flush();
	}
	
	public int conv(String s) {
		switch(s) {
		case "thou" : return 0;
		case "th" : return 0;
		case "inch" : return 1;
		case "in" : return 1;
		case "foot" : return 2;
		case "ft" : return 2;
		case "yard" : return 3;
		case "yd" : return 3;
		case "chain" : return 4;
		case "ch" : return 4;
		case "furlong" : return 5;
		case "fur" : return 5;
		case "mile" : return 6;
		case "mi" : return 6;
		case "league" : return 7;
		case "lea" : return 7;
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