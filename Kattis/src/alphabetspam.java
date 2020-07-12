import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class alphabetspam {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String in = file.nextLine();
		
		double white = 0, low = 0, up = 0, sym = 0;
		for(int i = 0; i < in.length(); i++) {
			if(in.substring(i,i+1).matches("[a-z]")) low++;
			else if(in.substring(i,i+1).matches("[A-Z]")) up++;
			else if(in.substring(i,i+1).matches("_")) white++;
			else sym++;
		}
		
		System.out.println(white/in.length());
		System.out.println(low/in.length());
		System.out.println(up/in.length());
		System.out.println(sym/in.length());
	}

	public static void main(String[] args) throws Exception {
		new alphabetspam().run();
	}

}