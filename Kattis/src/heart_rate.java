import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class heart_rate
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		

		for(int asdf = 0; asdf<times; asdf++)
		{
			double b = file.nextDouble(), p = file.nextDouble();
			double actual = 60 * b/p;
			double min = actual - 60/p;
			double max = actual + 60/p;
			
			System.out.printf("%.4f %.4f %.4f\n", min, actual, max);
		}
	}

	public static void main(String[] args) throws Exception
	{
		new heart_rate().run();
	}	
	
}