import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class shatteredcake {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int width = file.nextInt(), times = file.nextInt(), area = 0;

		for (int asdf = 0; asdf < times; asdf++) {
			area += file.nextInt() * file.nextInt();
		}
		
		System.out.println(area/width);
	}

	public static void main(String[] args) throws Exception {
		new shatteredcake().run();
	}

}