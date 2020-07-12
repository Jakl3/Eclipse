import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class coldputer_science
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		
		String[] in = file.nextLine().trim().split(" ");
		int count = 0;
		for(String val : in) {
			if(val.substring(0,1).equals("-")) count++;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception
	{
		new coldputer_science().run();
	}	
	
}