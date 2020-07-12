import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cudoviste {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int row = file.nextInt(), col = file.nextInt();
		file.nextLine();
		
		char[][] mat = new char[row][col];
		for(int i = 0; i < row; i++) {
			mat[i] = file.nextLine().toCharArray();
		}
		
		int[] spots = new int[5];
		
		for(int i = 0; i < row-1; i++) {
			for(int j = 0; j < col-1; j++) {
				
				if(mat[i][j] != '#' && mat[i][j+1] != '#' && mat[i+1][j] != '#' && mat[i+1][j+1] != '#') {
					
					char[] current = {mat[i][j],mat[i][j+1],mat[i+1][j],mat[i+1][j+1]};
					int count = 0;
					for(char item : current) {
						if(item == 'X') count++;
					}
					spots[count]++;
					
				}
			}
		}
		
		for(int item : spots) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) throws Exception {
		new cudoviste().run();
	}

}