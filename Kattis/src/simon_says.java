import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class simon_says
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		while(file.hasNext()) {
			String s = file.nextLine();
			if(s.contains("Simon says")) System.out.println(s.substring(10));
		}
	}

	public static void main(String[] args) throws Exception
	{
		new simon_says().run();
	}	
	
}