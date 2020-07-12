import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class maptiles2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String in = file.nextLine();
		
		int x = 0, y = 0;
		for(int i = 0; i < in.length(); i++) {
			int current = Integer.parseInt(in.substring(i,i+1));
			
			if(current == 1 || current == 3) {
				x += Math.pow(2, in.length() - 1 - i);
			}
			
			if(current == 2 || current == 3) {
				y += Math.pow(2, in.length() - 1 - i);
			}
			
		}
		
		System.out.println(in.length() + " " + x + " " + y);
	}

	public static void main(String[] args) throws Exception {
		new maptiles2().run();
	}

}