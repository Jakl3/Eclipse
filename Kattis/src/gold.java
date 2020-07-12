import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class gold
{
	
	char[][] mat;
	boolean[][] sdw;
	int num;
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int col = file.nextInt(), row = file.nextInt(), sr = 0, sc = 0;
		file.nextLine();
		mat = new char[row][col];
		sdw = new boolean[row][col];
		num = 0;
		
		for(int i = 0; i < sdw.length; i++) {
			Arrays.fill(sdw[i], true);
		}
		
		for(int i = 0; i < row; i++) {
			mat[i] = file.nextLine().toCharArray();
			for(int j = 0; j < col; j++) {
				if(mat[i][j] == 'P') {
					sr = i;
					sc = j;
				}
			}
		}
		
		recur(sr,sc);
		
		System.out.println(num);
		//System.out.println(sr + " " + sc);
		//System.out.println("\n" + Arrays.deepToString(mat).replaceAll("\\], \\[", "\n").replaceAll(", ", "").replaceAll("[\\[\\]]", ""));
		
	}
	
	public void recur(int r, int c) {
		if(r >= 0 && r < mat.length && c >= 0 && c < mat[r].length && mat[r][c] != '#' && mat[r][c] != 'T' && sdw[r][c]) {
			
			sdw[r][c] = false;
			
			
			if(mat[r][c] == 'G') {
				num++;
				mat[r][c] = '.';
			}
			
			if(inRangeR(r+1) && mat[r+1][c] == 'T' || inRangeR(r-1) && mat[r-1][c] == 'T' ||
					inRangeC(c+1) && mat[r][c+1] == 'T' || inRangeC(c-1) && mat[r][c-1] == 'T' )
				return;
			
			recur(r+1,c);
			recur(r-1,c);
			recur(r,c+1);
			recur(r,c-1);

			
		}
		
	
		
	}
	
	public boolean inRangeR(int r) {
		return(r >= 0 && r < mat.length);
	}
	
	public boolean inRangeC(int c) {
		return(c >= 0 && c < mat[0].length);
	}

	public static void main(String[] args) throws Exception
	{
		new gold().run();
	}	
	
}