import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class taisformula {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		double sum = 0;
		
		double[][] mat = new double[times][2];
		for (int i = 0; i < times; i++) {
			for(int j = 0; j < 2; j++) {
				mat[i][j] = file.nextDouble();
			}
		}
		
		/*for(double[] item : mat) {
			System.out.println(Arrays.toString(item));
		}*/
		
		for(int i = 0; i < times-1; i++) {
			sum += ((mat[i][1] + mat[i+1][1])/2)*(mat[i+1][0] - mat[i][0]);
		}
		
		System.out.println(sum/1000);
	}

	public static void main(String[] args) throws Exception {
		new taisformula().run();
	}

}