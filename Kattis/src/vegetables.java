import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class vegetables {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int t = file.nextInt();
		int n = file.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(file.nextInt());
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		new vegetables().run();
	}

}