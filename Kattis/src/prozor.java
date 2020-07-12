import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class prozor {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int r = file.nextInt();
		int s = file.nextInt();
		int k = file.nextInt();
		file.nextLine();
		
		char[][] mat = new char[r][s];
		boolean[][] visited = new boolean[r][s];
		for(int i = 0; i < r; i++) {
			mat[i] = file.nextLine().toCharArray();
		}
		
		int max = 0;
		int posr = 0, posc = 0;;
		for(int i = 0; i < r-(k-1); i++) {
			for(int j = 0; j < s-(k-1); j++) {
				visited[i][j] = true;
				int fly = flies(i,j,k, mat);
				if(fly > max) {
					max = fly;
					posr = i;
					posc = j;
				}
			}
		}
		
		mat[posr][posc] = '+';
		mat[posr+(k-1)][posc] = '+';
		mat[posr+(k-1)][posc+(k-1)] = '+';
		mat[posr][posc+(k-1)] = '+';
		
		for(int i = posr+1; i < posr+(k-1); i++) {
			mat[i][posc] = '|';
			mat[i][posc+(k-1)] = '|';
		}
		
		for(int i = posc+1; i < posc+(k-1); i++) {
			mat[posr][i] = '-';
			mat[posr+(k-1)][i] = '-';
		}
		
		System.out.println(max);
		for(char[] item : mat) {
			System.out.println(Arrays.toString(item).replaceAll("[\\[\\], ]", ""));
		}
	}
	
	public int flies(int r, int c, int k, char[][] mat) {
		int count = 0;
		for(int i = r+1; i < r + k-1; i++) {
			for(int j = c+1; j < c + k-1; j++) {
				if(mat[i][j] == '*') {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) throws Exception {
		new prozor().run();
	}

}