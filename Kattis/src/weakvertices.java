import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class weakvertices {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			int size = file.nextInt();
			if(size == -1) break;
			
			int[] numbers = new int[size];
			int[][] mat = new int[size][size];
			for(int i = 0; i < size; i++) {
				numbers[i] = i;
				for(int j = 0; j < size; j++) {
					mat[i][j] = file.nextInt();
				}
			}
			
			TreeSet<Integer> triangles = new TreeSet<Integer>();
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(mat[i][j] == 1) {
						boolean b = false;
						for(int k = 0; k < size; k++) {
							if(mat[i][k] == 1 && mat[k][i] == 1 && mat[j][k] == 1 && mat[k][j] == 1) {
								b = true;
							}
						}
						if(b) {
							triangles.add(i);
						}
					}
				}
			}
			
			String out = "";
			for(int item : numbers) {
				if(triangles.contains(item) == false) {
					out+=item + " ";
				}
			}
			
			System.out.println(out.trim());
		}
		
	}

	public static void main(String[] args) throws Exception {
		new weakvertices().run();
	}

}