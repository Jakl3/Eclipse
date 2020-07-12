import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class somesum {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		boolean even = false, odd = false;
		
		for(int i = 1; i <= 100; i++) {
			int k = i;
			int sum = 0;
			for(int j = 0; j < n; j++) {
				sum += k;
				k++;
			}
			if(sum % 2 == 0) even = true;
			else odd = true;
		}
		
		if(even && odd)
			System.out.println("Either");
		else if(even)
			System.out.println("Even");
		else
			System.out.println("Odd");

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new somesum().run();
	}

}