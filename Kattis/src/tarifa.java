import java.util.*;

import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tarifa
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int x = file.nextInt();
		int n = file.nextInt();
		ArrayList<Integer> in = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			in.add(file.nextInt());

		}
		
		int count = 0;
		for(int item : in) {
			count+=x-item;
		}
		
		System.out.println(count+x);
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new tarifa().run();
	}	
	
}