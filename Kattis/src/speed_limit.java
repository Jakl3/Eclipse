import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class speed_limit
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		boolean flag = false;
		while(file.hasNext() && flag == false) {
			int time = file.nextInt();
			int total = 0;
			ArrayList<Integer> speed = new ArrayList<Integer>();
			ArrayList<Integer> times = new ArrayList<Integer>();
			for(int i = 0; i < time; i++) {
				int s = file.nextInt();
				int t = file.nextInt();
				speed.add(s);
				times.add(t);
				//System.out.println(s + " abc " + t);
				if(s == -1 || t == -1) flag = true;
			}
			
			
			if(flag) break;
			
			if(times.size() > 0) {
				total += times.get(0) * speed.get(0);
				
				for(int i = 1; i < times.size(); i++) {
					total += (times.get(i)-times.get(i-1)) * speed.get(i);
				}
				
				System.out.println(total + " miles");
				
			}
			
			
			
		}
	}

	public static void main(String[] args) throws Exception
	{
		new speed_limit().run();
	}	
	
}