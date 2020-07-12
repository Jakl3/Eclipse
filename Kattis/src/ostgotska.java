import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ostgotska {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		String[] c = file.nextLine().split(" ");
		double count = 0;
		for(String s : c)
			if(s.contains("ae"))
				count++;
		System.out.println(count / c.length >= .4 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska");
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new ostgotska().run();
	}

}