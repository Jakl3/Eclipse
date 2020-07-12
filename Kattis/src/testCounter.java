import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class testCounter {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		file.nextLine();file.nextLine();file.nextLine();file.nextLine();file.nextLine();file.nextLine();file.nextLine();
		file.nextLine();file.nextLine();file.nextLine();file.nextLine();file.nextLine();file.nextLine();file.nextLine();
		
		double count = 0;
		int c = 0;
		
		while(file.hasNext()) {
			String s = file.nextLine();
			if(s.equals("Next") || s.equals("PreviousNext")) break;
			c++;
			String[] in = s.split("\t");
			//System.out.println(in[8]);
			count+= Double.parseDouble(in[8]);
		}
		
		System.out.println(c + " " + count);
	}

	public static void main(String[] args) throws Exception {
		new testCounter().run();
	}

}