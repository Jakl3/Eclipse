import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class prva {
	
	char[][] mat;
	
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int r = file.nextInt(), c = file.nextInt();
		file.nextLine();
		
		mat = new char[r][c];
		for(int i = 0; i < r; i++) {
			mat[i] = file.nextLine().toCharArray();
		}
		
		TreeSet<String> words = new TreeSet<String>();
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(mat[i][j] == '#') continue;
				
				String temp = "";
				temp += mat[i][j];
				
				//vertical
				if(i-1 < 0 || i > 0 && mat[i-1][j] == '#') {
					int k = i+1;
					while(k < r && mat[k][j] != '#') {
						temp += mat[k][j];
						k++;
					}
					if(temp.length() > 1) words.add(temp);
				}
				
				temp = "";
				temp += mat[i][j];
				
				//horizontal
				if(j-1 < 0 || j > 0 && mat[i][j-1] == '#') {
					int k = j+1;
					while(k < c && mat[i][k] != '#') {
						temp += mat[i][k];
						k++;
					}
					if(temp.length() > 1) words.add(temp);
				}
			}
		}
		
		System.out.println(words.first());
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new prva().run();
	}

}