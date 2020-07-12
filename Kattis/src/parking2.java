import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class parking2
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		

		for(int asdf = 0; asdf<times; asdf++)
		{
			int store = file.nextInt();
			TreeSet<Integer> set = new TreeSet<Integer>();
			for(int i = 0; i < store; i++) {
				set.add(file.nextInt());
			}
			int out = set.last()-set.first();
			out*=2;
			System.out.println(out);
		}
	}

	public static void main(String[] args) throws Exception
	{
		new parking2().run();
	}	
	
}