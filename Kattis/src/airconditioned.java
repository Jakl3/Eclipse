import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class airconditioned {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new airconditioned().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		int N = f.nextInt();
		ArrayList<Pair> list = new ArrayList<>();
		for(int i = 0; i < N; i++) list.add(new Pair(f.nextInt(), f.nextInt()));
		
		Collections.sort(list);
		
		int currRoom = list.get(0).b;
		int cnt = 0;
		for(int i = 0; i < list.size(); i++) {
			Pair p = list.get(i);
			if(p.a > currRoom) {
				currRoom = p.b;
				cnt++;
			}
			else {
				if(p.b < currRoom) {
					currRoom = p.b;
				}
			}
		}
		out.println(cnt+1);
		
		///
		f.close();
		out.flush();
	}
	
	private class Pair implements Comparable<Pair> {
		int a,b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(Pair p) {
			if(this.a == p.a) return this.b - p.b;
			return this.a - p.a;
		}
		
		public String toString() {
			return a + " " + b;
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