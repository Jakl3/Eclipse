import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class everywhere {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			TreeSet<String> set = new TreeSet<String>();
			int cities = file.nextInt(); 
			file.nextLine();
			
			for(int i = 0; i < cities; i++) {
				set.add(file.nextLine());
			}
			System.out.println(set.size());
		}
	}

	public static void main(String[] args) throws Exception {
		new everywhere().run();
	}

}