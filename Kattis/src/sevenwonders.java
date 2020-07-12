import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sevenwonders {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		char[] in = file.nextLine().toCharArray();
		
		int t = 0, c = 0, g = 0, sum = 0;
		
		for(char item : in) {
			switch(item) {
			case 'T' : t++; break;
			case 'C' : c++; break;
			case 'G' : g++; break;
			}
		}
		
		//System.out.println(t + " " + c + " " + g);
		
		sum += Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2);
		
		while(t != 0 && c != 0 && g != 0) {
			sum+=7;
			t--;
			c--;
			g--;
		}
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) throws Exception {
		new sevenwonders().run();
	}

}