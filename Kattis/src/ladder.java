import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ladder {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double h = file.nextDouble(), v = Math.toRadians(file.nextDouble());
		
		System.out.println((int)Math.ceil(h/(Math.sin(v))));
	}

	public static void main(String[] args) throws Exception {
		new ladder().run();
	}

}