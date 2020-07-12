import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class checkerboard {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = Integer.parseInt(file.nextLine());
		
		char[][] mat = new char[n][n];
		for(int i = 0; i < n; i++) {
			mat[i] = file.nextLine().toCharArray();
			//System.out.println(Arrays.toString(mat[i]));
		}
		
		System.out.println(solve(mat, n) ? 1 : 0);
		
		file.close();
	}
	
	public boolean solve(char[][] mat, int n) {
		
		//check row & col
		for(int i = 0; i < n; i++) {
			int rw = 0, rb = 0;
			int cw = 0, cb = 0;
			
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == 'W') rw++;
				if(mat[i][j] == 'B') rb++;
				if(mat[j][i] == 'W') cw++;
				if(mat[j][i] == 'B') cb++;
			}
			
			if(rw != rb || cw != rb) return false;
		}
		
		//check consec
		for(int i = 0; i < n; i++) {
			for(int j = 2; j < n; j++) {
				if(mat[i][j] == mat[i][j-1] && mat[i][j] == mat[i][j-2])
					return false;
				if(mat[j][i] == mat[j-1][i] && mat[j][i] == mat[j-2][i])
					return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) throws Exception {
		new checkerboard().run();
	}

}