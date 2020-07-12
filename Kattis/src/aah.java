import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class aah
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String jon = file.nextLine(), doc = file.nextLine();
		
		System.out.println(jon.length() >= doc.length() ? "go" : "no");
	}

	public static void main(String[] args) throws Exception
	{
		new aah().run();
	}	
	
}