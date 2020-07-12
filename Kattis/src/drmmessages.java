import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class drmmessages {
	
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String in = file.nextLine();
		String first = in.substring(0,in.length()/2);
		String last = in.substring(in.length()/2);
		
		char[] firstList = rotate(first).toCharArray();
		char[] lastList = rotate(last).toCharArray();
		
		
		String out = "";
		for(int i = 0; i < firstList.length; i++) {
			out += (char)((((firstList[i] - 'A') + (lastList[i] - 'A')) % 26) + 'A');
		}
		
		System.out.println(out);
		
		
	}
	
	public String rotate(String in) {
		int count = 0;
		char[] input = in.toCharArray();
		for(char item : input) {
			count += item - 'A';
		}
		
		String out = "";
		for(char item : input) {
			//out += letters[(item - 'A') + count];
			out += (char)((((item - 'A') + count) % 26) + 'A');
		}
		
		return out;
	}

	public static void main(String[] args) throws Exception {
		new drmmessages().run();
	}

}