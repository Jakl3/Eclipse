import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class krizaljka {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String a = file.next(), b = file.next();
		int al = a.length(), bl = b.length();
		
		char[][] mat = new char[bl][al];
		
		int afind = 0, bfind = 0;
		for(int i = 0; i < al; i++) {
			int n = b.indexOf(a.substring(i,i+1));
			if(n != -1) {
				afind = i;
				bfind = n;
				break;
			}
		}
		
		for(int i = 0; i < bl; i++) {
			Arrays.fill(mat[i], '.');
			mat[i][afind] = b.charAt(i);
		}
		
		for(int i = 0; i < al; i++) {
			mat[bfind][i] = a.charAt(i);
		}
		
		for(char[] item : mat) {
			System.out.println(Arrays.toString(item).replaceAll("[\\[\\], ]", ""));
		}
			
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new krizaljka().run();
	}

}