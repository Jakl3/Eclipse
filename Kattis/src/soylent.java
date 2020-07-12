import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class soylent {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = Integer.parseInt(file.nextLine());
		
		for(int i = 0; i < times; i++) {
			System.out.println((int)Math.ceil(file.nextInt() / 400.0));
		}
		
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new soylent().run();
	}

}