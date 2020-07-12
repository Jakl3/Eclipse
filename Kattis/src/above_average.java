import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class above_average
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 

		for(int asdf = 0; asdf<times; asdf++)
		{
			
			int num = file.nextInt(), count = 0;
			double avg = 0;
			int[] in = new int[num];
			for(int i = 0; i < num; i++) {
				in[i] = file.nextInt();
				avg += in[i];
			}
			avg /= in.length;
			
			
			for(int item : in) {
				if(item > avg) count++;
			}
			
			double numppl = ((double)count/in.length) * 100;
			
			System.out.printf("%.3f", numppl);
			System.out.println("%");
			
		}
	}

	public static void main(String[] args) throws Exception
	{
		new above_average().run();
	}	
	
}