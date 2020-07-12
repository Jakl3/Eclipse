import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class empleh {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		char[][] mat = new char[17][13];
		
		int n = 0;
		for(int i = 0; i < 17; i++) {
			if(i % 2 == 0) {
				mat[i] = "+---+---+---+---+---+---+---+---+".toCharArray();
			}
			else {
				if(n % 2 == 0) {
					mat[i] = "|...|:::|...|:::|...|:::|...|:::|".toCharArray();
				}
				else {
					mat[i] = "|:::|...|:::|...|:::|...|:::|...|".toCharArray();
				}
				n++;
			}
			
			//System.out.println(Arrays.toString(mat[i]).replaceAll("[\\[\\], ]",""));
		}
		
		List<String> white = new ArrayList<String>(Arrays.asList(file.nextLine().split("[ ,]")));
		List<String> black = new ArrayList<String>(Arrays.asList(file.nextLine().split("[ ,]")));
		
		Queue<String> w = new LinkedList<String>();
		w.addAll(white);
		w.poll();
		
		Queue<String> b = new LinkedList<String>();
		b.addAll(black);
		b.poll();
		
		String[][] spots = new String[8][8];
		
		while(!w.isEmpty()) {
			char[] s = w.poll().toCharArray();
			char letter = 0;
			int r = 0;
			int c = 0;
			
			if(s.length == 2) {
				letter = 'P';
				r = s[0] - 'a';
				c = 8 - (s[1] - '0');
			}
			else {
				letter = s[0];
				r = s[1] - 'a';
				c = 8 - (s[2] - '0');
			}
			
			spots[c][r] = "" + (char)letter;
		}
		
		while(!b.isEmpty()) {
			char[] s = b.poll().toCharArray();
			char letter = 0;
			int r = 0;
			int c = 0;
			
			if(s.length == 2) {
				letter = 'p';
				r = s[0] - 'a';
				c = 8 - (s[1] - '0');
			}
			else {
				letter = Character.toLowerCase(s[0]);
				r = s[1] - 'a';
				c = 8 - (s[2] - '0');
			}
			
			spots[c][r] = "" + (char)letter;
		}
		
/*		for(int i = 0; i < 8; i++) {
			System.out.println(Arrays.toString(spots[i]));
		}*/
		
		int r = 0, c = 0;
		for(int i = 1; i < 16; i+= 2) {
			c = 0;
			for(int j = 2; j < 31; j += 4) {
				if(spots[r][c] != null)
					mat[i][j] = spots[r][c].charAt(0);
				c++;
			}
			r++;
		}
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]).replaceAll("[\\[\\], ]",""));
		}
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new empleh().run();
	}

}