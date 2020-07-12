import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class reversed_binary_numbers
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		StringBuffer out = new StringBuffer(toBinaryString(file.nextInt()));
		
		System.out.println(Integer.parseInt(out.reverse().toString(),2));
		
	}

	public static void main(String[] args) throws Exception
	{
		new reversed_binary_numbers().run();
	}	
	
}