import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class r2
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int r1 = file.nextInt();
		int s = file.nextInt();
		
		System.out.println((s*2)-r1);
		
	}

	public static void main(String[] args) throws Exception
	{
		new r2().run();
	}	
	
}