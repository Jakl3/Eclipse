import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class secretmessage {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String in = file.nextLine();
			int side = (int)Math.ceil(Math.sqrt(in.length()));
			
			String[] bruh = in.split("");
			String[][] mat = new String[side][side];
			
			int k = 0;
			for(int i = 0; i < side; i++) {
				for(int j = 0; j < side; j++) {
					if(k < bruh.length)
						mat[i][j] = bruh[k++];
					else
						mat[i][j] = "*";
				}
			}
			
			
			String out = "";
			for(int i = 0; i < side; i++) {
				for(int j = side-1; j >= 0; j--) {
					if(mat[j][i].equals("*") == false) out += mat[j][i];
				}
			}
			
			System.out.println(out);
		}
	}

	public static void main(String[] args) throws Exception {
		new secretmessage().run();
	}

}