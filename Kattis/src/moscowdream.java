import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class moscowdream {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int a, b, c, n;
		a = file.nextInt();
		b = file.nextInt();
		c = file.nextInt();
		n = file.nextInt();
		System.out.println(a != 0 && b != 0 && c != 0 && (a + b + c) >= n && n >= 3 ? "YES" : "NO");
		

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new moscowdream().run();
	}

}