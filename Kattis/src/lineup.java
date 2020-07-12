import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class lineup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		ArrayList<String> names = new ArrayList<String>(), copy = new ArrayList<String>();
		
		for (int asdf = 0; asdf < times; asdf++) {
			String m = file.nextLine();
			names.add(m);
			copy.add(m);
		}
		Collections.sort(copy);
		
		ArrayList<String> backcopy = new ArrayList<String>();
		for(int i = copy.size()-1; i >= 0; i--) {
			backcopy.add(copy.get(i));
		}
		
		System.out.println(names.toString().equals(copy.toString()) ? "INCREASING" : names.toString().equals(backcopy.toString()) ? "DECREASING" : "NEITHER");
		
		
		
		
	}

	public static void main(String[] args) throws Exception {
		new lineup().run();
	}

}