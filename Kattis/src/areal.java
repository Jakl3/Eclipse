import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class areal {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double area = file.nextDouble();
		area = Math.sqrt(area);
		System.out.println(area * 4);
		
	}

	public static void main(String[] args) throws Exception {
		new areal().run();
	}

}