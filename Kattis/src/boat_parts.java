import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class boat_parts
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int p = file.nextInt(), n = file.nextInt(), count = 0, save = 0; file.nextLine();
		TreeSet<String> in = new TreeSet<String>();
		
		for(int i = 0; i < n; i++) {
			String s = file.nextLine();
			if(in.add(s) == true) {
				count++;
			}
			if(save == 0 && in.size() == p) {
				save = i+1;
			}
		}
	
		System.out.println(count == p ? save : "paradox avoided");
		
		
		
		
		
	}

	public static void main(String[] args) throws Exception
	{
		new boat_parts().run();
	}	
	
}