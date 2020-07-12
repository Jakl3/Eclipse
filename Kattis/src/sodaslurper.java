import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sodaslurper {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int e = file.nextInt(), f = file.nextInt(), c = file.nextInt();
		int empty = e + f;
		
		int count = 0;
		while(empty >= c) {
			int fullSodas = empty/c;
			int remain = empty % c;
			empty = fullSodas + remain;
			count += fullSodas;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new sodaslurper().run();
	}

}