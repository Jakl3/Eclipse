import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class filip {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String[] in = {new StringBuilder(file.next()).reverse().toString(), new StringBuilder(file.next()).reverse().toString() };
		
		Arrays.sort(in);
		System.out.println(in[in.length-1]);
	}

	public static void main(String[] args) throws Exception {
		new filip().run();
	}

}