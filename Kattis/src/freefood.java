import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class freefood {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int days = file.nextInt();
		file.nextLine();

		int[] day = new int[366];
		for (int asdf = 0; asdf < days; asdf++) {
			int start = file.nextInt();
			int end = file.nextInt();
			for(int i = start; i <= end; i++) {
				day[i] = 1;
			}
		}
		
		int count = 0;
		for(int i = 0; i < day.length; i++) {
			if(day[i] != 0) count++;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new freefood().run();
	}

}