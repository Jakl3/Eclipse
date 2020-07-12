import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class t9spelling {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();
		
		String[] numbers = "2 22 222 3 33 333 4 44 444 5 55 555 6 66 666 7 77 777 7777 8 88 888 9 99 999 9999".split(" ");

		for (int asdf = 0; asdf < times; asdf++) {
			char[] in = file.nextLine().toCharArray();
			String out = "";
			for(int i = 0; i < in.length; i++) {
				
				if(in[i] == ' ') {
					if(out.endsWith("0")) out+= " ";
					out+= "0";
					continue;
				}
				
				if(out.endsWith( numbers[in[i] - 'a'].substring(0,1) )) {
					out += " ";
				}
				
				out += numbers[in[i] - 'a'];
			}
			System.out.println("Case #" + (asdf+1) + ": " + out);
		}
	}

	public static void main(String[] args) throws Exception {
		new t9spelling().run();
	}

}