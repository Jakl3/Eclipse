import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class imageprocessing {
	public void run() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] image = new int[h][w];
		int[][] kernel = new int[n][m];
		
		for(int i = 0; i < h; i++) {
			StringTokenizer bruh = new StringTokenizer(in.readLine());
			for(int j = 0; j < w; j++) {
				image[i][j] = Integer.parseInt(bruh.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer bruh = new StringTokenizer(in.readLine());
			for(int j = 0; j < m; j++) {
				kernel[i][j] = Integer.parseInt(bruh.nextToken());
			}
		}
		
		
		
	}

	public static void main(String[] args) throws Exception {
		new imageprocessing().run();
	}

}