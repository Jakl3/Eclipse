import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tri {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int a = file.nextInt(), b = file.nextInt(), c = file.nextInt();
		
		if(a + b == c) System.out.println(a + "+" + b + "=" + c);
		else if(a - b == c) System.out.println(a + "-" + b + "=" + c);
		else if(a * b == c) System.out.println(a + "*" + b + "=" + c);
		else if(a / b == c) System.out.println(a + "/" + b + "=" + c);
		
		else if(a == b - c) System.out.println(a + "=" + b + "-" + c);
		else if(a == b + c) System.out.println(a + "=" + b + "+" + c);
		else if(a == b / c) System.out.println(a + "=" + b + "/" + c);
		else if(a == b * c) System.out.println(a + "=" + b + "*" + c);
		
	}

	public static void main(String[] args) throws Exception {
		new tri().run();
	}

}