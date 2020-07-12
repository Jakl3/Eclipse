import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class abc
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String[] in = file.nextLine().split(" ");
		Arrays.sort(in);
		
		String out = "";
		
		char[] let = file.nextLine().toCharArray();
		for(char s : let) {
			if(s == 'A') out += in[0] + " ";
			if(s == 'B') out += in[1] + " ";
			if(s == 'C') out += in[2] + " ";
		}
		System.out.println(out);
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new abc().run();
	}	
	
}