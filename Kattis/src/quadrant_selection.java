import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class quadrant_selection
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int x = file.nextInt();
		int y = file.nextInt();
		
		int out = 0;
		
		if(x > 0 && y > 0) out = 1;
		else if(x < 0 && y > 0) out = 2;
		else if(x < 0 && y < 0) out = 3;
		else if(x > 0 && y < 0) out = 4;
		
		System.out.println(out);
		
	}

	public static void main(String[] args) throws Exception
	{
		new quadrant_selection().run();
	}	
	
}