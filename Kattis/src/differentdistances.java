import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class differentdistances {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			double x1 = file.nextDouble();
			if(x1 == 0) break;
			double y1 = file.nextDouble(), x2 = file.nextDouble(), y2 = file.nextDouble(), p = file.nextDouble();
			System.out.println( Math.pow( Math.pow(Math.abs(x1-x2) , p ) + Math.pow(Math.abs(y1-y2) , p )  , (1/p) ) ) ;
		}
	}

	public static void main(String[] args) throws Exception {
		new differentdistances().run();
	}

}