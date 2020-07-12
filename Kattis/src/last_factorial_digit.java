import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class last_factorial_digit
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		

		for(int asdf = 0; asdf<times; asdf++)
		{
			long sum = file.nextInt(), x = sum-1;
		
			while(x>0) {
		
				sum*=x;
				x--;
				
			}
			System.out.println(sum%10);
			
			
		}
		
	}

	public static void main(String[] args) throws Exception
	{
		new last_factorial_digit().run();
	}	
	
}