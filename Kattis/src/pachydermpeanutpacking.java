import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class pachydermpeanutpacking {
	public static void main(String[] args) throws Exception {
		new pachydermpeanutpacking().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		String s;
		while((s = f.nextLine()) != null) {
			int n = Integer.parseInt(s);
			if(n == 0) break;
			List<Box> list = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				list.add(new Box(f.nextDouble(), f.nextDouble(), f.nextDouble(), f.nextDouble(), f.next()));
			}
			
			int m = f.nextInt();
			for(int i = 0; i < m; i++) {
				double x = f.nextDouble(), y = f.nextDouble();
				String type = f.next();
				boolean ok = false;
				for(int j = 0; j < n; j++) {
					if(list.get(j).contains(x, y)) {
						ok = true;
						if(type.equals(list.get(j).type))
							out.println(type + " correct");
						else
							out.println(type + " " + list.get(j).type);
						break;
					}
				}
				if(!ok) out.println(type + " floor");
			}
			out.println();
		}
		///
		out.flush();
	}
	
	private class Box {
		//p1 = bottom left
		//p2 = top right
		double x1, x2, y1, y2;
		String type;
		public Box(double x1, double y1, double x2, double y2, String type) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.type = type;
		}
		public String toString() {
			return x1 + " " + y1 + " " + x2 + " " + y2 + " " + type;
		}
		public boolean contains(double x, double y) {
			return x >= x1 && x <= x2 && y >= y1 && y <= y2;
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