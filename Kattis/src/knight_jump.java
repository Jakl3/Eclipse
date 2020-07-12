/*import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class knight_jump
{
	
	char[][] mat;
	int[][] sdw;
	int step;
	
	public void run() throws Exception
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int dim = Integer.parseInt(file.readLine()), sr = 0, sc = 0;
		mat = new char[dim][dim];
		sdw = new int[dim][dim];
		step = Integer.MAX_VALUE;
		
		for(int i = 0; i < dim; i++) {
			mat[i] = file.readLine().trim().toCharArray();
			Arrays.fill(sdw[i], Integer.MAX_VALUE);
			for(int j = 0; j < dim; j++) {
				if(mat[i][j] == 'K') {
					sr = i;
					sc = j;
				}
			}
		}
		
		recur(sr,sc,0);
		
		System.out.println(step == Integer.MAX_VALUE ? -1 : step);
	}
	
	public void recur(int r, int c, int s) {
		if(inRange(r,c) && s < step && s < sdw[r][c] && mat[r][c] != '#') {
			
			if(r == 0 && c == 0 && s < step) {
				step = s;
				return;
			}
			
			sdw[r][c] = s;
			s++;
			
			char save = mat[r][c];
			mat[r][c] = '#';
			
			recur(r-1,c-2,s);
			recur(r+2,c+1,s);
			recur(r+2,c-1,s);
			recur(r-2,c+1,s);
			recur(r-2,c-1,s);
			recur(r+1,c+2,s);
			recur(r+1,c-2,s);
			recur(r-1,c+2,s);
			
			mat[r][c] = save;
			
		}
	} 
	
	public boolean inRange(int r, int c) {
		return r < mat.length && r >= 0 && c < mat[r].length && c >= 0;
	}

	public static void main(String[] args) throws Exception
	{
		new knight_jump().run();
	}	
	
}*/

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class knight_jump
{
	
	char[][] mat;
	int[][] sdw;
	boolean[][] visited;
	
	public void run() throws Exception
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int dim = Integer.parseInt(file.readLine());
		mat = new char[dim][dim];
		sdw = new int[dim][dim];
		visited = new boolean[dim][dim];
		
		int sr = 0, sc = 0;
        int[] dr = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dc = {1, -1, 1, -1, 2, -2, 2, -2};
		
		for(int i = 0; i < dim; i++) {
			mat[i] = file.readLine().trim().toCharArray();
			Arrays.fill(sdw[i], Integer.MAX_VALUE);
			for(int j = 0; j < dim; j++) {
				if(mat[i][j] == 'K') {
					sr = i;
					sc = j;
				}
			}
		}
		
		Queue<Pos> queue = new LinkedList<Pos>();
		Pos start = new Pos(sr,sc);
		start.s = 0;
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			Pos temp = queue.poll();
			if(!inRange(temp.r,temp.c)) continue;
			if(visited[temp.r][temp.c]) continue;
			if(temp.s > sdw[temp.r][temp.c]) continue;
			if(mat[temp.r][temp.c] == '#') continue;
			
			visited[temp.r][temp.c] = true;
			sdw[temp.r][temp.c] = Math.min(sdw[temp.r][temp.c], temp.s);
			
			for(int i = 0; i < 8; i++) {
				Pos in = new Pos(temp.r + dr[i], temp.c + dc[i]);
				in.s = temp.s + 1;
				queue.offer(in);
			}
		}
		
		System.out.println(sdw[0][0] == Integer.MAX_VALUE ? -1 : sdw[0][0]);
	}
	
	public boolean inRange(int r, int c) {
		return r < mat.length && r >= 0 && c < mat[r].length && c >= 0;
	}

	public static void main(String[] args) throws Exception {
		new knight_jump().run();
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

}

