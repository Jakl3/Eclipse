import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class register {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		int[] finished = {1, 2, 4, 6, 10, 12, 16, 18};
		
		int[] in = new int[8];
		for(int i = 0; i < 8; i++) {
			in[i] = file.nextInt();
		}
		
		int steps = 0;
		while(in[7] < 18) {
			steps += 510510;
			in[7]++;
		}
		
		while(!Arrays.equals(in, finished)) {
			steps++;
			in[0]++;
			
			if(in[0] == 2) {
				in[0] = 0;
				in[1]++;
			}
			if(in[1] == 3) {
				in[1] = 0;
				in[2]++;
			}
			if(in[2] == 5) {
				in[2] = 0;
				in[3]++;
			}
			if(in[3] == 7) {
				in[3] = 0;
				in[4]++;
			}
			if(in[4] == 11) {
				in[4] = 0;
				in[5]++;
			}
			if(in[5] == 13) {
				in[5] = 0;
				in[6]++;
			}
			if(in[6] == 17) {
				in[6] = 0;
				in[7]++;
			}
		}
		
		System.out.println(steps);


		file.close();
	}

	public static void main(String[] args) throws Exception {
		new register().run();
	}

}