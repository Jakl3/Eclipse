import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class eligibility {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			boolean good = false;
			
			String[] in = file.nextLine().split("[ /]");
			
			String name = in[0];
			if(Integer.parseInt(in[1]) >= 2010)
				good = true;
			
			if(Integer.parseInt(in[4]) >= 1991)
				good = true;
			
			if(good == true) {
				System.out.println(name + " eligible");
				continue;
			}
			
			if(Integer.parseInt(in[7]) > 40 && good == false)
				System.out.println(name + " ineligible");
			else
				System.out.println(name + " coach petitions");
				
		}
	}

	public static void main(String[] args) throws Exception {
		new eligibility().run();
	}

}