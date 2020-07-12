import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class drunkvigenere {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int[] encrypted = toIntArray(file.nextLine());
		int[] key = toIntArray(file.nextLine());
		
/*		System.out.println(Arrays.toString(encrypted));
		System.out.println(Arrays.toString(key));*/
		
		for(int i = 0; i < encrypted.length; i++) {
			if(i % 2 == 1) {
				encrypted[i] += key[i];
				if(encrypted[i] > 25) {
					encrypted[i] -= 26;
				}
			}
			else {
				encrypted[i] -= key[i];
				if(encrypted[i] < 0) {
					encrypted[i] += 26;
				}
			}
		}
		
		System.out.println(toString(encrypted));
		
		
		
	}
	
	public int[] toIntArray(String s) {
		char[] c = s.toCharArray();
		int[] out = new int[c.length];
		for(int i = 0; i < out.length; i++) {
			out[i] = c[i] - 'A';
		}
		return out;
	}
	
	public String toString(int[] in) {
		String out = "";
		for(int item : in) {
			out += (char)(item + 'A');
		}
		return out;
	}

	public static void main(String[] args) throws Exception {
		new drunkvigenere().run();
	}

}