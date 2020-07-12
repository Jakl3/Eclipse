import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bijele
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String[] in = file.nextLine().trim().split(" ");
		ArrayList<Integer> out = new ArrayList<Integer>();
		
		out.add(1- Integer.parseInt(in[0]));
		out.add(1-Integer.parseInt(in[1]));
		out.add(2-Integer.parseInt(in[2]));
		out.add(2-Integer.parseInt(in[3]));
		out.add(2-Integer.parseInt(in[4]));
		out.add(8-Integer.parseInt(in[5]));
		
		System.out.println(out.toString().replaceAll("[\\]\\[,]", ""));
	}

	public static void main(String[] args) throws Exception
	{
		new bijele().run();
	}	
	
}