import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class exchangerates {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(true) {
			int days = file.nextInt();
			if(file.hasNext() == false) break;
			
			
			double maxCAD = 1000.00;
			double maxUSD = 0;
			
			while(days-- > 0) {
				double rate = file.nextDouble();
				
				maxUSD = Math.max(maxUSD, maxCAD / rate * .97);
				maxCAD = Math.max(maxCAD, maxUSD * rate * .97);
				
				maxUSD = round(maxUSD,2);
				maxCAD = round(maxCAD,2);
				
				
			}
			
			System.out.printf("%.2f\n", maxCAD);
			
			
		}
	}
	
	private static double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.DOWN);
	    return bd.doubleValue();
	}
	
	public static void main(String[] args) throws Exception {
		new exchangerates().run();
	}

}