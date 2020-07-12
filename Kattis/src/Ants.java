import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Ants
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("ants.in"));
		int times = file.nextInt(); 
		file.nextLine();

		for(int asdf = 0; asdf < times; asdf++)
		{
			int l = file.nextInt();
			int num = file.nextInt();
			ArrayList<Integer> in = new ArrayList<Integer>();
			for(int i = 0; i < num; i++) {
				in.add(file.nextInt());
			}
			
			int shortest = shorte(in,l);
			System.out.println(shortest);
			
		}
	}
	
	public int shorte(ArrayList<Integer> in, int l) {
		int min = Integer.MAX_VALUE;
		for(int item : in) {
			if(l-item < min) min = l-item;
		}
		return 0;
	}

	public static void main(String[] args) throws Exception
	{
		new Ants().run();
	}	
	
}