import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hangingout {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		
		int lim = file.nextInt(), times = file.nextInt(), cur = 0, count = 0;
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			
			String s = file.next();
			int i = file.nextInt(); 
			
			if(s.equals("enter") && cur + i <= lim) cur+=i;
			else if(s.equals("leave")) cur-=i;
			else count++;
				
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new hangingout().run();
	}

}