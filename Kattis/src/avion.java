import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class avion {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int asdf = 0; asdf < 5; asdf++) {
			if(file.nextLine().contains("FBI")) list.add(asdf+1);
		}
		
		System.out.println(list.size() == 0 ? "HE GOT AWAY!" : list.toString().replaceAll("[\\[\\],]", ""));
	}

	public static void main(String[] args) throws Exception {
		new avion().run();
	}

}