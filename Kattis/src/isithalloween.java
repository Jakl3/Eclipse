import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class isithalloween {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String s = file.nextLine();
		System.out.println(s.equals("OCT 31") || s.equals("DEC 25") ? "yup" : "nope");
		
	}

	public static void main(String[] args) throws Exception {
		new isithalloween().run();
	}

}