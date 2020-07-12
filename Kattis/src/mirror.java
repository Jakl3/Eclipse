import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mirror {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 1; abc <= cases; ++abc) {
			int r = file.nextInt(), c = file.nextInt();
			file.nextLine();
			
			char[][] mat = new char[r][c];
			for(int i = 0; i < r; i++) {
				mat[i] = file.nextLine().toCharArray();
			}
			
			char[][] copy = new char[r][c];
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					copy[r-i-1][c-j-1] = mat[i][j];
				}
			}
			
			System.out.println("Test " + abc);
			
			for(int i = 0; i < r; i++ ) {
				System.out.println(Arrays.toString(copy[i]).replaceAll("[\\[\\], ]", ""));
			}
			
		}
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new mirror().run();
	}

}