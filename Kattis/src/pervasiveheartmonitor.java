import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pervasiveheartmonitor {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			String[] in = file.nextLine().split(" ");
			double total = 0;
			int nums = 0;
			
			String name = "";
			for(String item : in) {
				try {
					double x = Double.parseDouble(item);
					total += x;
					nums++;
				}
				catch (NumberFormatException e)  {
					name += item + " ";
				}
			}
			
			System.out.println((total / nums) + " " + name.trim());

			
		}
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new pervasiveheartmonitor().run();
	}

}