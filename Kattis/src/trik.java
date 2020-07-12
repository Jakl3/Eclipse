import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class trik {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		char[] in = file.nextLine().toCharArray();
		int pos = 1;
		
		for(char item : in) {
			if(item == 'A' && pos == 1) pos = 2;
			else if(item == 'B' && pos == 2) pos = 3;
			else if(item == 'C' && pos == 3) pos = 1;
			
			else if(item == 'A' && pos == 2) pos = 1;
			else if(item == 'B' && pos == 3) pos = 2;
			else if(item == 'C' && pos == 1) pos = 3;
		}
		
		System.out.println(pos);
		
	}

	public static void main(String[] args) throws Exception {
		new trik().run();
	}

}