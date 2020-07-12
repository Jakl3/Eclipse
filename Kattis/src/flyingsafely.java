import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class flyingsafely {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 0; abc < cases; abc++) {
			int n = file.nextInt(), m = file.nextInt();
			for(int i = 0; i < m; i++) {
				file.nextInt(); file.nextInt();
			}
			System.out.println(n-1);
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new flyingsafely().run();
	}

}