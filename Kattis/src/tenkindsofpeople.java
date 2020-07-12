import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tenkindsofpeople {
	
	char[][] mat;
	static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
	/*int[][] sdw;
	boolean[][] visited;*/
	
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(file.readLine());
		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		mat = new char[r][c];
		
		
		
		for(int i = 0; i < r; i++) {
			mat[i] = file.readLine().trim().toCharArray();
		}
		
		int times = Integer.parseInt(file.readLine());
		
		int[][] groups = new int[r][c];
		int fill = 2;
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(groups[i][j] == 0) {
					bfs(new Point(i,j),mat,groups,fill);
					fill++;
				}
			}
		}
		
		while(times--> 0) {
			
			//boolean dec = false, bin = false;
			//System.out.println();
			
			/*sdw = new int[r][c];
			visited = new boolean[r][c];
			for(int i = 0; i < r; i++) {
				Arrays.fill(sdw[i], Integer.MAX_VALUE);
			}*/
			
			StringTokenizer read = new StringTokenizer(file.readLine());
			int r1 = Integer.parseInt(read.nextToken()) -1;
			int c1 = Integer.parseInt(read.nextToken()) -1;
			int r2 = Integer.parseInt(read.nextToken()) -1;
			int c2 = Integer.parseInt(read.nextToken()) -1;
			
			if(groups[r1][c1] == groups[r2][c2]) {
				System.out.println(mat[r1][c1] == '1'? "decimal" : "binary");
			}
			else System.out.println("neither");

			
			//System.out.println(start + " " + end);
			
			/*Queue<Point> qDec = new LinkedList<Point>();
			Queue<Point> qBin = new LinkedList<Point>();
			start.s = 0;
			qDec.offer(start);
			qBin.offer(start);
			
			while(!qDec.isEmpty()) {
				//System.out.println("dec " + qDec);
				Point temp = qDec.poll();
				
				if(!inRange(temp.r,temp.c)) continue;
				if(visited[temp.r][temp.c]) continue;
				if(temp.s > sdw[temp.r][temp.c]) continue;
				if(mat[temp.r][temp.c] == '0') continue;
				if(temp.r == end.r && temp.c == end.c) {
					dec = true;
					break;
				}
				
				sdw[temp.r][temp.c] = Math.min(sdw[temp.r][temp.c], temp.s);
				visited[temp.r][temp.c] = true;
				
				for(int i = 0; i < dr.length; i++) {
					Point in = new Point(temp.r + dr[i], temp.c + dc[i]);
					in.s = temp.s + 1;
					qDec.offer(in);
				}
				
			}
			
			//System.out.println();
			
			while(!qBin.isEmpty()) {
				//System.out.println("bin " + qBin);
				Point temp = qBin.poll();
				if(!inRange(temp.r,temp.c)) continue;
				if(visited[temp.r][temp.c]) continue;
				if(temp.s > sdw[temp.r][temp.c]) continue;
				if(mat[temp.r][temp.c] == '1') continue;
				if(temp.r == end.r && temp.c == end.c) {
					bin	 = true;
					break;
				}
				
				sdw[temp.r][temp.c] = Math.min(sdw[temp.r][temp.c], temp.s);
				visited[temp.r][temp.c] = true;
				
				for(int i = 0; i < dr.length; i++) {
					Point in = new Point(temp.r + dr[i], temp.c + dc[i]);
					in.s = temp.s + 1;
					qBin.offer(in);
				}
			}
			
			if(dec && !bin) System.out.println("decimal");
			else if(!dec && bin) System.out.println("binary");
			else if(!dec && !bin) System.out.println("neither");
			else System.out.println(dec + " " + bin);*/
			
			
		}
		
		
		
	}
	
	public static void bfs(Point start, char[][] mat, int[][] groups, int fill) {
		Queue<Point> q = new LinkedList<Point>();
		q.offer(start);
		
		groups[start.r][start.c] = fill; 
		
		while(!q.isEmpty()) {
			Point temp = q.poll();
			
			int r = temp.r;
			int c = temp.c;	
			
			for(int i = 0; i < 4; i++) {
				int tryR = temp.r + dr[i];
				int tryC = temp.c + dc[i];
				
				if(inRange(tryR,tryC, mat)) {
					if(mat[r][c] == mat[tryR][tryC] && groups[tryR][tryC] != fill) {
						groups[tryR][tryC] = fill;
						q.offer(new Point(tryR,tryC));
					}
				}
				
			}
		}
	}
	
	public static boolean inRange(int r, int c, char[][] mat) {
		return r < mat.length && r >= 0 && c < mat[r].length && c >= 0;
	}

	public static void main(String[] args) throws Exception {
		new tenkindsofpeople().run();
	}

}

class Point {
	int r;
	int c;
	
	public Point(int r, int c) {
		this.r = r;
		this.c = c;
	}
	
	public String toString() {
		return r + "," + c;
	}
}