import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class glitchbot {

	PrintWriter out;

	public static void main(String[] args) throws Exception {
		new glitchbot().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		out = new PrintWriter(System.out);
		///
		Pos end = new Pos(f.nextInt(),f.nextInt());
		int n = f.nextInt();
		char[] directions = new char[n];
		for(int i = 0; i < n; i++) directions[i] = f.nextLine().charAt(0);
		solve(directions,n,end);
		///
		f.close();
		out.flush();
	}
	
	public void solve(char[] directions, int n, Pos end) {
		for(int i = 0; i < n; i++) {
			char[] dirs = {'R','L','F'};
			String[] out = {"Right","Left","Forward"};
			int skip = directions[i] == 'R' ? 0 : directions[i] == 'L' ? 1 : 2;
			char save = directions[i];
			for(int j = 0; j < 3; j++) {
				if(j == skip) continue;
				directions[i] = dirs[j];
				Pos p = runThrough(directions);
				//System.out.println(i + ":" + p);
				if(runThrough(directions).equals(end)) {
					System.out.println((i+1) + " " + out[j]);
					return;
				}
			}
			directions[i] = save;
		}
	}
	
	public Pos runThrough(char[] dirs) {
		Pos curr = new Pos(0,0);
		char facing = 'U';
		
		for(char item : dirs) {
			if(item == 'F') {
				switch(facing) {
				case 'U': { curr.y++; break; }
				case 'D': { curr.y--; break; }
				case 'R': { curr.x++; break; }
				case 'L': { curr.x--; break; }
				}
			}
			
			else if(item == 'R') {
				switch(facing) {
				case 'U': { facing = 'R'; break; }
				case 'R': { facing = 'D'; break; }
				case 'L': { facing = 'U'; break; }
				case 'D': { facing = 'L'; break; }
				}
			}
			else if(item == 'L') {
				switch(facing) {
				case 'U': { facing = 'L'; break; }
				case 'R': { facing = 'U'; break; }
				case 'L': { facing = 'D'; break; }
				case 'D': { facing = 'R'; break; }
				}
			}
		}
		
		return curr;
	}
	
	static class Pos {
		int x, y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return x + " " + y;
		}
		public boolean equals(Pos p) {
			return this.x == p.x && this.y == p.y;
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