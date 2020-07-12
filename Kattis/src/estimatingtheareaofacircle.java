import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class estimatingtheareaofacircle {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		while(file.hasNext()) {
			double r = file.nextDouble(), m = file.nextDouble(), c = file.nextDouble();
			if(r == 0 && m == 0 && c == 0) break;
			
			System.out.println((Math.PI * r * r) + " " + ((c/m) * (r*2) * (r*2)));
			
			
		}
	}

	public static void main(String[] args) throws Exception {
		new estimatingtheareaofacircle().run();
	}

}