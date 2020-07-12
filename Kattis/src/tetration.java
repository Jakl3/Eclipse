import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tetration
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		double i = file.nextDouble();
		System.out.printf("%.6f",Math.pow(i, 1/i));
	}

	public static void main(String[] args) throws Exception
	{
		new tetration().run();
	}	
	
}