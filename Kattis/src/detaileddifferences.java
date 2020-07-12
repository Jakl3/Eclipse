import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class detaileddifferences {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			char[] a = file.nextLine().toCharArray();
			char[] b = file.nextLine().toCharArray();
			
			String out = "";
			
			for(int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) out+= "*";
				else out+=".";
			}
			
			System.out.println(Arrays.toString(a).replaceAll("[\\[\\], ]", ""));
			System.out.println(Arrays.toString(b).replaceAll("[\\[\\], ]", ""));
			System.out.println(out);
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		new detaileddifferences().run();
	}

}