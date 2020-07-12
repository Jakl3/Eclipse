import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class skener {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int r = file.nextInt(), c = file.nextInt(), zr = file.nextInt(), zc = file.nextInt(); file.nextLine();
		char[][] mat = new char[r][c];
		char[][] copy = new char[r*zr][c*zc];
		
		for(int i = 0; i < r; i++) {
			mat[i] = file.nextLine().toCharArray();
		}
		
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = i*zr; k < i*zr+zr; k++) {
					for(int e = j*zc; e < j*zc+zc; e++) {
						copy[k][e] = mat[i][j];
						
					}
				}
			}
		}
		
		System.out.println(Arrays.deepToString(copy).replaceAll("\\], \\[", "\n").replaceAll("[\\[\\] ,]", ""));
	}

	public static void main(String[] args) throws Exception {
		new skener().run();
	}

}