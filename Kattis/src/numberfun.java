import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class numberfun
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		

		for(int asdf = 0; asdf<times; asdf++)
		{
			double a = file.nextInt();
			double b = file.nextInt();
			double c = file.nextInt();
			
			boolean out = false;
			
			if(a + b == c || a - b == c || b - a == c || a * b == c || a / b == c || b / a == c) out = true;
			System.out.println(out ? "Possible" : "Impossible");
		}
	}

	public static void main(String[] args) throws Exception
	{
		new numberfun().run();
	}	
	
}