import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class hidingplaces {
	public static void main(String[] args) throws Exception {
		new hidingplaces().run();
	}

	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		///
		int t = f.nextInt();
		while(t-->0) {
			int[][] sdw = new int[8][8];
			for(int i = 0; i < 8; i++) Arrays.fill(sdw[i], Integer.MAX_VALUE);
			char[] x = f.nextLine().toCharArray();
			int r = 8 - (x[1] - '0');
			int c = x[0] - 'a';
			
	        int[] dr = {2, 2, -2, -2, 1, 1, -1, -1};
	        int[] dc = {1, -1, 1, -1, 2, -2, 2, -2};
	        
			Queue<Pos> queue = new LinkedList<Pos>();
			Pos start = new Pos(r,c);
			start.s = 0;
			queue.offer(start);
			
			int max = -1;
			while(!queue.isEmpty()) {
				Pos temp = queue.poll();
				if(!inRange(temp.r,temp.c)) continue;
				if(temp.s > sdw[temp.r][temp.c]) continue;
	
				sdw[temp.r][temp.c] = Math.min(sdw[temp.r][temp.c], temp.s);
				max = Math.max(max,sdw[temp.r][temp.c]);
				
				for(int i = 0; i < 8; i++) {
					Pos in = new Pos(temp.r + dr[i], temp.c + dc[i]);
					in.s = temp.s + 1;
					queue.offer(in);
				}
			}
			
			out.print(max);
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(sdw[i][j] == max) {
						out.print(" " + (char)(j + 'a') + (8 - i));
					}
				}
			}
			out.println();
			
		}
		///
		out.flush();
	}
	
	public boolean inRange(int r, int c) {
		return r < 8 && r >= 0 && c < 8 && c >= 0;
	}
	
	private class Pos {
		int r;
		int c;
		int s;
		
		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
		
		public String toString() {
			return r + "," + c;
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