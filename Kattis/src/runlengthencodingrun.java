import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class runlengthencodingrun {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String[] in = file.nextLine().split(" ");
		
		if(in[0].equals("E")) {
			System.out.println(encode(in[1]));
		}
		else {
			System.out.println(decode(in[1]));
		}

		file.close();
	}
	
	public String encode(String s) {
		String out = "";
		
		char[] c = s.toCharArray();
		int i = 0;
		while(i < c.length) {
			int curr = i;
			int num = 0;
			while(curr < c.length && c[i] == c[curr]) {
				curr++;
				num++;
			}
			out += "" + c[i] + num;
			i = curr;
		}
		
		return out;
	}
	
	public String decode(String s) {
		String out = "";
		
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length-1; i += 2) {
			char letter = c[i];
			int n = c[i+1] - '0';
			for(int j = 0; j < n; j++) {
				out += letter;
			}
		}
		
		return out;
	}

	public static void main(String[] args) throws Exception {
		new runlengthencodingrun().run();
	}

}