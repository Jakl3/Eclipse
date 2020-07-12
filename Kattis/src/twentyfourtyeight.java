import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class twentyfourtyeight {
	
	int[][] mat;
	
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		mat = new int[4][4];
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(file.nextLine());
			for(int j = 0; j < 4; j++) {
				mat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int dir = file.nextInt();
		
		if(dir == 0) {
			shiftLeft();
			
			for(int i = 0; i < 4; i++) {
				for(int j = 1; j < 4; j++) {
					if(mat[i][j] == mat[i][j-1] && mat[i][j] != 0) {
						mat[i][j] = 0;
						mat[i][j-1] = mat[i][j-1] * 2;
					}
				}
			}
			
			shiftLeft();
		}
		else if(dir == 2) {;
			shiftRight();
			
			for(int i = 0; i < 4; i++) {
				for(int j = 2; j >= 0; j--) {
					if(mat[i][j] == mat[i][j+1] && mat[i][j] != 0) {
						mat[i][j] = 0;
						mat[i][j+1] = mat[i][j+1] * 2;
					}
				}
			}
			
			shiftRight();
			
		}
		else if(dir == 1) {
			shiftUp();
			
			for(int i = 0; i < 4; i++) {
				for(int j = 1; j < 4; j++) {
					if(mat[j][i] == mat[j-1][i] && mat[j][i] != 0) {
						mat[j][i] = 0;
						mat[j-1][i] = mat[j-1][i] * 2;
					}
				}
			}
			
			shiftUp();
			
		}
		else {
			shiftDown();
			
			for(int i = 0; i < 4; i++) {
				for(int j = 2; j >= 0; j--) {
					if(mat[j][i] == mat[j+1][i] && mat[j][i] != 0) {
						mat[j][i] = 0;
						mat[j+1][i] = mat[j+1][i] * 2;
					}
				}
			}
			
			shiftDown();
		}
		
		for(int[] item : mat) {
			System.out.println(Arrays.toString(item).replaceAll("[\\[\\],]",""));
		}
		
		

		file.close();

	}
	
	public void shiftLeft() {
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				int k = j;
				while(k > 0 && mat[i][k-1] == 0) {
					mat[i][k-1] = mat[i][k];
					mat[i][k] = 0;
					k--;
				}
			}
		}
	}
	
	public void shiftRight() {
		for(int i = 0; i < 4; i++) {
			for(int j = 2; j >= 0; j--) {
				int k = j;
				while(k < 3 && mat[i][k+1] == 0) {
					mat[i][k+1] = mat[i][k];
					mat[i][k] = 0;
					k++;
				}
			}
		}
	}
	
	public void shiftUp() {
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				int k = j;
				while(k > 0 && mat[k-1][i] == 0) {
					mat[k-1][i] = mat[k][i];
					mat[k][i] = 0;
					k--;
				}
			}
		}
	}
	
	public void shiftDown() {
		for(int i = 0; i < 4; i++) {
			for(int j = 2; j >= 0; j--) {
				int k = j;
				while(k < 3 && mat[k+1][i] == 0) {
					mat[k+1][i] = mat[k][i];
					mat[k][i] = 0;
					k++;
				}
			}
		}
	}
	
	public boolean inRange(int r, int c) {
		return r < mat.length && r >= 0 && c < mat[r].length && c >= 0;
	}

	public static void main(String[] args) throws Exception {
		new twentyfourtyeight().run();
	}

}