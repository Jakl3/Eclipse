import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bela {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt() * 4;
		char dom = file.next().charAt(0);
		file.nextLine();

		int count = 0;
		
		for (int asdf = 0; asdf < times; asdf++) {
			char[] in = file.nextLine().toCharArray();
			if(in[1] == dom) {
				switch(in[0]) {
				case 'A' : count+=11; break;
				case 'K' : count+=4; break;
				case 'Q' : count+=3; break;
				case 'J' : count+=20; break;
				case 'T' : count+=10; break;
				case '9' : count+=14; break;
				}
			}
			else {
				switch(in[0]) {
				case 'A' : count+=11; break;
				case 'K' : count+=4; break;
				case 'Q' : count+=3; break;
				case 'J' : count+=2; break;
				case 'T' : count+=10; break;
				}
			}
		
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new bela().run();
	}

}