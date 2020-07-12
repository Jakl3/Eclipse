import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hangman
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String in = file.nextLine().trim();
		String[] s = file.nextLine().trim().split("");
		int i = 0;
		int k = 0;
		
		while(i < 10) {
			int x = in.length();
			in = in.replaceAll(s[k++], "");
			if(in.length() == x) i++;
		}
		
		System.out.println(in.length() > 0 ? "LOSE" : "WIN");
	
		
	}

	public static void main(String[] args) throws Exception
	{
		new hangman().run();
	}	
	
}