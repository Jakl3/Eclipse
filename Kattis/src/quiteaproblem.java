import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class quiteaproblem {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			String in = file.nextLine().toLowerCase();
			System.out.println(in.indexOf("problem") != -1 ? "yes" : "no");
		}
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new quiteaproblem().run();
	}

}