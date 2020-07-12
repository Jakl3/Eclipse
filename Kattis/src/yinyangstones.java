import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class yinyangstones {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		char[] s = file.nextLine().toCharArray();

		int w = 0, b = 0;
		for(char item : s) {
			if(item == 'W') w++;
			else b++;
		}
		
		System.out.println(w == b ? 1 : 0);
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new yinyangstones().run();
	}

}