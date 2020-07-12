import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tajna {
	public void run() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String unmsg = in.readLine();
		
		int r = 0, c = 0;
		int tr = 1;
		while(tr < unmsg.length()) {
			if(unmsg.length() % tr == 0) {
				if(tr <= unmsg.length() / tr) {
					r = tr;
					c = unmsg.length() / tr;
				}
			}
			tr++;
		}
		
		char[][] mat = new char[r][c];
		int k = 0;
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {
				mat[j][i] = unmsg.charAt(k++);
			}
		}
		
		for(char[] item : mat) {
			System.out.print(Arrays.toString(item).replaceAll("[\\[\\], ]", ""));
		}
	}

	public static void main(String[] args) throws Exception {
		new tajna().run();
	}

}