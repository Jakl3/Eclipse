import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class relocation {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int companies = file.nextInt();
		int queries = file.nextInt();
		
		int[] locations = new int[companies];
		
		for(int i = 0; i < companies; i++) {
			locations[i] = file.nextInt();
		}
		
		for(int i = 0; i < queries; i++) {
			int command = file.nextInt();
			int a1 = file.nextInt();
			int a2 = file.nextInt();
			
			if(command == 1) {
				locations[a1-1] = a2;
			}
			else {
				System.out.println(Math.abs(locations[a1-1] - locations[a2-1]));
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new relocation().run();
	}

}