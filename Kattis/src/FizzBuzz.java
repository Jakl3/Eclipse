import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class FizzBuzz
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int x = file.nextInt();
		int y = file.nextInt();
		int n = file.nextInt();
		for(int i = 1; i < n+1; i++) {
			if(i % x == 0 && i % y == 0) System.out.println("FizzBuzz");
			else if(i % x == 0) System.out.println("Fizz");
			else if(i % y == 0) System.out.println("Buzz");
			else System.out.println(i);
		}
	}

	public static void main(String[] args) throws Exception
	{
		new FizzBuzz().run();
	}	
	
}