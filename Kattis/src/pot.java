import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pot
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		
		int sum = 0;

		for(int asdf = 0; asdf<times; asdf++)
		{
			int x = file.nextInt();
			int pow = x % 10;
			int time = x / 10;
			
			sum+=Math.pow(time, pow);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) throws Exception
	{
		new pot().run();
	}	
	
}