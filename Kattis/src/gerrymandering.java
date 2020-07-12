import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class gerrymandering {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt(), districts = file.nextInt();
		double[] districtsA = new double[districts];
		double[] districtsB = new double[districts];
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int pos = file.nextInt();
			districtsA[pos-1] += file.nextDouble();
			districtsB[pos-1] += file.nextDouble();
		}
		
		/*System.out.println(Arrays.toString(districtsA));
		System.out.println(Arrays.toString(districtsB));*/
		
		double wasteA = 0, wasteB = 0;
		
		for(int i = 0; i < districts; i++) {
			boolean aWin = districtsA[i] > districtsB[i];
			String out = aWin ? "A " : "B ";
			out += aWin ? (int)(Math.ceil(districtsA[i] - ((districtsA[i] + districtsB[i])/2 + 1))) + " " + (int)districtsB[i] : (int)districtsA[i] + " " + (int)(Math.ceil(districtsB[i] - ((districtsA[i] + districtsB[i])/2 + 1)));
			System.out.println(out);
			
			wasteA += aWin ? Math.ceil(districtsA[i] - ((districtsA[i] + districtsB[i])/2 + 1)) : districtsA[i];
			wasteB += aWin ? districtsB[i] : Math.ceil(districtsB[i] - ((districtsA[i] + districtsB[i])/2 + 1));
		}
		
		System.out.printf("%.10f",(Math.abs(wasteA - wasteB))/(sum(districtsA) + sum(districtsB)));
	}

	public double sum(double[] n) {
		double sum = 0;
		for(double item : n) {
			sum+= item;
		}
		return sum;
		
	}
	
	public static void main(String[] args) throws Exception {
		new gerrymandering().run();
	}

}