import java.util.*;
import java.io.*;

public class bus {
	public static void main(String[] args) throws Exception {
		new bus().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = file.nextInt();
		
		for(int abc = 0; abc < cases; abc++) {
			int n = file.nextInt();
			double x = 1.5;
			for(int i = 0; i < n-1; i++) {
				x *= 2;
				x += .5;
			}
			x -= .5;
			
			System.out.println((int)x);
		}

		file.close();
	}

}