import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tripletexting {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String in = file.nextLine();
		
		String one = in.substring(0,in.length()/3), two = in.substring(in.length()/3, 2*in.length()/3), three = in.substring(2*in.length()/3);
		
		ArrayList<String> test = new ArrayList<String>();
		test.add(one);
		test.add(two);
		test.add(three);
		
		Collections.sort(test);
		for(int i = 0; i < test.size()-1; i++) {
			if(test.get(i).equals(test.get(i+1))) {
				System.out.println(test.get(i));
				return;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new tripletexting().run();
	}

}