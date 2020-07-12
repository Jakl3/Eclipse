import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class encodedmessage {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			char[] in = file.nextLine().toCharArray();
			int k = 0;
			char[][] square = new char[(int)Math.sqrt(in.length)][(int)Math.sqrt(in.length)];
			char[][] squareCopy = new char[(int)Math.sqrt(in.length)][(int)Math.sqrt(in.length)];
			
			for(int i = 0; i < square.length; i++) {
				for(int j = 0; j < square.length; j++) {
					square[i][j] = in[k];
					squareCopy[square.length-1-j][i] = in[k];
					k++;
				}
			}

			for(char[] item : squareCopy) {
				for(char val : item) {
					System.out.print(val);
				}
			}
				
			System.out.println();
			
		}
	}

	public static void main(String[] args) throws Exception {
		new encodedmessage().run();
	}

}