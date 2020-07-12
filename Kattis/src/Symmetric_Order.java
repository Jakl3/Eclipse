import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Symmetric_Order
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		
		int j = 1;
		while(file.hasNext()) {
			int times = file.nextInt(); file.nextLine();
			ArrayList<String> front = new ArrayList<String>();
			ArrayList<String> back = new ArrayList<String>();
			
			for(int i = 0; i < times; i++) {
				if(i % 2 == 0) {
					front.add(file.nextLine());
				}
				else if(i % 2 == 1) {
					back.add(file.nextLine());
				}
			}

			
			ArrayList<String> out = new ArrayList<String>();
			out.addAll(front);
			
			for(int i = back.size()-1; i >= 0; i--) {
				out.add(back.get(i));
			}
			

			if(out.size() > 0) {
				System.out.println("Set " + j++);
				for(String item : out) {
					System.out.println(item);
				}
			}
			
			
		}
	}

	public static void main(String[] args) throws Exception
	{
		new Symmetric_Order().run();
	}	
	
}