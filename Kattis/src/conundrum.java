import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class conundrum {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String in = file.nextLine();
		String per = "";
		for(int i = 0; i < in.length()/3; i++) {
			per += "PER";
		}
		
		char[] perC = per.toCharArray(), inC = in.toCharArray();
		
		int count = 0;
		for(int i = 0; i < perC.length; i++) {
			if(perC[i] != inC[i]) count++;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new conundrum().run();
	}

}