import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class piece_of_cake
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String[] in = file.nextLine().split(" ");
		int one = Math.max(Integer.parseInt(in[0]) - Integer.parseInt(in[1]), Integer.parseInt(in[1]));
		int two = Math.max(Integer.parseInt(in[0]) - Integer.parseInt(in[2]), Integer.parseInt(in[2]));
		System.out.println(one * two * 4);
	}

	public static void main(String[] args) throws Exception
	{
		new piece_of_cake().run();
	}	
	
}