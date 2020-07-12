import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class chanukah {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int numb = file.nextInt();
			int days = file.nextInt();
			
			int sum = 0;
			for(int i = 0; i < days; i++) {
				sum+=(i+1);
				sum++;
			}
			
			System.out.println(numb + " " + sum);
		}
	}

	public static void main(String[] args) throws Exception {
		new chanukah().run();
	}

}