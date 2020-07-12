import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class reverserot
{
	public void run() throws Exception
	{
		
		Scanner file = new Scanner(System.in);
		
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		
		while(file.hasNext()) {
			int rot = file.nextInt();
			if(rot == 0) break;
			StringBuilder in = new StringBuilder(file.next());
			in.reverse();
			
			for(int i = 0; i < in.length(); i++) {
				
				int j = s.indexOf(in.charAt(i)) + rot;
				
				if(j >= s.length()) {
					j = (j)%(s.length());
				}
				in.setCharAt(i,s.charAt(j));
			}
			
			System.out.println(in);
		}
	}

	public static void main(String[] args) throws Exception
	{
		new reverserot().run();
	}	
	
}