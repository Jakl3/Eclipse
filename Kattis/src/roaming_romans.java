import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class roaming_romans
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		double times = file.nextDouble(); 
		System.out.println(Math.round(times * 1000 * (5280.0/4854)));
	}

	public static void main(String[] args) throws Exception
	{
		new roaming_romans().run();
	}	
	
}