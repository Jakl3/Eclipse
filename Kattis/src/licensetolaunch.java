import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class licensetolaunch {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		ArrayList<Integer> days = new ArrayList<Integer>();
		
		for (int asdf = 0; asdf < times; asdf++) {
			days.add(file.nextInt());
		}
		
		int pos = 0;
		
		for(int i = 0; i < days.size(); i++) {
			if(days.get(i) < days.get(pos)) pos = i;
		}
		
		System.out.println(pos);
	}

	public static void main(String[] args) throws Exception {
		new licensetolaunch().run();
	}

}