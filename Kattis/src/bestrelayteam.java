import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class bestrelayteam {
	public static void main(String[] args) throws Exception {
		new bestrelayteam().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int n = f.nextInt();
		List<Runner> list = new ArrayList<>();
		for(int i = 0; i < n; i++) list.add(new Runner(f.next(), f.nextDouble(), f.nextDouble()));
		Collections.sort(list);
		List<Runner> best = new ArrayList<>();
		double min = Double.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			List<Runner> hold = new ArrayList<>();
			double curr = list.get(i).first;
			hold.add(list.get(i));
			int t = 0;
			for(int j = 0; j < 3; j++) {
				if(t == i) t++;
				curr += list.get(t).rest;
				hold.add(list.get(t));
				t++;
			}
			if(curr < min) {
				min = curr;
				best = hold;
			}
		}
		
		out.println(min);
		for(Runner item : best) out.println(item.name);
		
		
		
		///
		out.flush();
	}
	private class Runner implements Comparable<Runner> {
		String name;
		double first, rest;
		public Runner(String name, double f, double s) {
			this.name = name;
			first = f;
			rest = s;
		}
		public String toString() {
			return name + " " + first + " " + rest;
		}
		public int compareTo(Runner r) {
			return Double.compare(this.rest, r.rest);
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