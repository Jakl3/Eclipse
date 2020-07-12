import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class janitortroubles {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double one = file.nextDouble(), two = file.nextDouble(), three = file.nextDouble(), four = file.nextDouble();
		
		double semi = (one + two + three + four) / 2;
		
		System.out.println(Math.sqrt((semi - one) * (semi - two) * (semi - three) * (semi - four)));
	}

	public static void main(String[] args) throws Exception {
		new janitortroubles().run();
	}

}