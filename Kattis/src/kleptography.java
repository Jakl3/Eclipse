import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kleptography {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		int[][] tabula = new int[26][26];
		for(int i = 0; i < 26; i++) {
			int k = 0;
			for(int j = i; j < 26; j++) {
				tabula[i][k++] = (j);
			}
			for(int j = 0; k < tabula[i].length; j++) {
				tabula[i][k++] = (j);
			}
		}
		
		int n = file.nextInt(), m = file.nextInt(); file.nextLine();
		String last = file.next();
		String cipher = file.next();
		int[] lastChars = toIntArray(last);
		int[] ciphers = toIntArray(cipher);
		
		int[] out = new int[ciphers.length+n];
		
		int k = n-1;
		for(int i = out.length-1; i > out.length-1-n; i--) {
			out[i] = lastChars[k--];
		}
		
		for(int i = m-1; i >= 0; i--) {
			out[i] = (char)(indexOf(tabula[out[i+n]],ciphers[i]));
		}
		
		System.out.println(toString(out).substring(n));
		
	}
	
	public int indexOf(int[] a, int b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b) return i;
		}
		return -1;
	}
	
	public int[] toIntArray(String s) {
		char[] c = s.toCharArray();
		int[] out = new int[c.length];
		for(int i = 0; i < out.length; i++) {
			out[i] = c[i] - 'a';
		}
		return out;
	}
	
	public String toString(int[] in) {
		String out = "";
		for(int item : in) {
			out += (char)(item + 'a');
		}
		return out;
	}
	
		

	public static void main(String[] args) throws Exception {
		new kleptography().run();
	}

}