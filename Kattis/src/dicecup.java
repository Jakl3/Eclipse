import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class dicecup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int one = file.nextInt()+1;
		int two = file.nextInt()+1;
		
		if(one > two) {
			int temp = two;
			two  = one;
			one = temp;
		}
		
		
		for(int i = one; i <= two; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws Exception {
		new dicecup().run();
	}

}