import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class onechicken
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int n = file.nextInt(), m = file.nextInt();
		
		int nm = n - m;
		int mn = m - n;
		
		if(n < m) {
			if(mn == 1) System.out.println("Dr. Chaz will have " + (m-n) + " piece of chicken left over!");
			else System.out.println("Dr. Chaz will have " + (m-n) + " pieces of chicken left over!");

		}
		else {
			if(nm == 1) System.out.println("Dr. Chaz needs " + nm + " more piece of chicken!");
			else System.out.println("Dr. Chaz needs " + nm + " more pieces of chicken!");
		}
	}

	public static void main(String[] args) throws Exception
	{
		new onechicken().run();
	}	
	
}