import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class conquestcampaign {
	public static void main(String[] args) throws Exception {
		new conquestcampaign().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int r = f.nextInt(), c = f.nextInt(), n = f.nextInt();
		Queue<Pos> q = new LinkedList<>();
		int[][] mat = new int[r][c];
		for(int i = 0; i < n; i++) {
			int x = f.nextInt(), y = f.nextInt();
			x--;
			y--;
			q.offer(new Pos(x,y));
			mat[x][y] = 1;
		}
		
		int day = 1;
		
		int[] dx = {-1,1,0,0}, dy = {0,0,1,-1};
		while(!q.isEmpty()) {
			Pos temp = q.poll();
			int currx = temp.x, curry = temp.y;
			
			for(int i = 0; i < 4; i++) {
				int nextx = currx + dx[i];
				int nexty = curry + dy[i];
				if(!inRange(nextx,nexty,r,c)) continue;
				if(mat[nextx][nexty] == 0) {
					mat[nextx][nexty] = mat[currx][curry] + 1;
					day = mat[nextx][nexty];
					q.offer(new Pos(nextx,nexty));
				}
			}
		}
		out.println(day);
		
		///
		out.flush();
	}
	
	public boolean inRange(int x, int y, int mx, int my) {
		return x >= 0 && x < mx && y >= 0 && y < my;
	}
	
	private class Pos {
		int x;
		int y;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return x + "," + y;
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