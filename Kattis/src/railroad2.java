import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class railroad2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int x = file.nextInt(), y = file.nextInt();
		
		System.out.println(y % 2 == 0 ? "possible" : "impossible");
	}

	public static void main(String[] args) throws Exception {
		new railroad2().run();
	}

}