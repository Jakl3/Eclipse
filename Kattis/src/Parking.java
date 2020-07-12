import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Parking
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int sum = 0;
		int a = file.nextInt(), b = file.nextInt(), c = file.nextInt();
		
		int[] hours = new int[100];
		for(int i = 0; i < 3; i++) {
			int start = file.nextInt();
			int end = file.nextInt();
			for(int j = start-1; j < end-1; j++) {
				hours[j]++;
			}
		}
		
		for(int item : hours) {
			if(item == 1) {
				sum+=a;
			}
			if(item == 2) { 
				sum+=2*b;
			}
			if(item == 3) {
				sum+=3*c;
			}
		}

		System.out.println(sum);
	}

	public static void main(String[] args) throws Exception
	{
		new Parking().run();
	}	
	
}