import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class modulo
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		TreeSet<Integer> set = new TreeSet<Integer>();

		for(int i = 0; i < 10; i++) {
			int in = file.nextInt();
			set.add(in % 42);

		}
		System.out.println(set.size());
	}

	public static void main(String[] args) throws Exception
	{
		new modulo().run();
	}	
	
}