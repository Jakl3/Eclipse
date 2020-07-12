import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class spavanac
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int min = file.nextInt();
		int sec = file.nextInt();
		
		if(sec < 45) {
			if(min == 0) min = 23;
			else min--;
			sec = 60+sec-45;
		}
		
		else sec-=45;
		
		System.out.println(min + " " + sec);
		
	}

	public static void main(String[] args) throws Exception
	{
		new spavanac().run();
	}	
	
}