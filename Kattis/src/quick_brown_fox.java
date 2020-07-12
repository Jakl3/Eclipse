import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class quick_brown_fox
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String[] charx = alpha.split("");
		
		for(int asdf = 0; asdf<times; asdf++)
		{
			ArrayList<String> chars = new ArrayList<String>(Arrays.asList(charx));
			String[] in = file.nextLine().toLowerCase().trim().split("");
			for(String item : in) {
				if(chars.indexOf(item) != -1)
					chars.remove(chars.indexOf(item));
			}
			System.out.println(chars.size() == 0 ? "pangram" : "missing " + chars.toString().replaceAll("[\\[\\], ]", ""));
		}
		
	}

	public static void main(String[] args) throws Exception
	{
		new quick_brown_fox().run();
	}	
	
}