import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class jabuke {
	public static void main(String[] args) throws Exception {
		new jabuke().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		double[] x = new double[3];
		double[] y = new double[3];
		for(int i = 0; i < 3; i++) {
			x[i] = f.nextDouble();
			y[i] = f.nextDouble();
		}
		double area = Math.abs(x[0] * (y[1]-y[2]) + x[1] * (y[2] - y[0]) + x[2] * (y[0] - y[1])) / 2;
		out.println(area);
		
		Triangle t = new Triangle(x[0],y[0],x[1],y[1],x[2],y[2]);
		int n = f.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(t.contains(f.nextDouble(),f.nextDouble())) cnt++;
		}
		out.println(cnt);
		///
		out.flush();
	}
	
	private class Triangle {
		double x3, y3, y23, x32, y31, x13, det, maxD, minD;
		public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
			this.x3 = x3;
			this.y3 = y3;
	        y23 = y2 - y3;
	        x32 = x3 - x2;
	        y31 = y3 - y1;
	        x13 = x1 - x3;
	        det = y23 * x13 - x32 * y31;
	        minD = Math.min(det, 0);
	        maxD = Math.max(det, 0);
		}
	    public boolean contains(double x, double y) {
	        double dx = x - x3;
	        double dy = y - y3;
	        double a = y23 * dx + x32 * dy;
	        if (a < minD || a > maxD)
	            return false;
	        double b = y31 * dx + x13 * dy;
	        if (b < minD || b > maxD)
	            return false;
	        double c = det - a - b;
	        if (c < minD || c > maxD)
	            return false;
	        return true;
	    }
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