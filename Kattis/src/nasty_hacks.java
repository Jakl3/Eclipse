import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class nasty_hacks
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in); 	
		
		int times = file.nextInt(); 
		file.nextLine();
		

		for(int asdf = 0; asdf<times; asdf++)
		{
			int one = file.nextInt(), two = file.nextInt(), three = file.nextInt();
			System.out.println(two - three > one ? "advertise" : two - three == one ? "does not matter" : "do not advertise");
		}
	}

	public static void main(String[] args) throws Exception
	{
		new nasty_hacks().run();
	}	
	
}