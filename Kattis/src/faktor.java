import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class faktor {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		System.out.println((file.nextInt() * (file.nextInt()-1))+1);
	}

	public static void main(String[] args) throws Exception {
		new faktor().run();
	}

}