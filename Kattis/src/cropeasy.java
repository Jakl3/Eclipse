import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cropeasy {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int n = file.nextInt(), a = file.nextInt(), b = file.nextInt(), c = file.nextInt(), d = file.nextInt(), x0 = file.nextInt(), y0 = file.nextInt(), m = file.nextInt();
			//System.out.println(n + " " + a + " " + b + " " + c + " " + d + " " + x0+ " " + y0 + " " + m);
			
			ArrayList<Double> trees = new ArrayList<Double>();
			
			double x = x0, y = y0;
			trees.add(x);
			trees.add(y);
			for(int i = 1; i < n; i++) {
				x = (a * x + b) % m;
				y = (c * y + d) % m;
				trees.add(x);
				trees.add(y);
			}
			
			//System.out.println(trees);
			
			int count = 0;
			for(int i = 0; i < trees.size()-4; i+=2) {
				for(int j = i+2; j < trees.size()-2; j+=2) {
					for(int k = j+2; k < trees.size(); k+=2) {
						double x1 = trees.get(i), y1 = trees.get(i+1);
						double x2 = trees.get(j), y2 = trees.get(j+1);
						double x3 = trees.get(k), y3 = trees.get(k+1);
						
						//System.out.println("[" + x1 + "," + y1 + "|" + x2 + "," + y2 + "|" + x3 + "," + y3 + "]");
						
						double xfin = (x1+x2+x3);
						double yfin = (y1+y2+y3);
						if(xfin % 3 == 0 && yfin % 3 == 0) count++;
					}
				}
			}
			
			System.out.println("Case #" + (asdf+1) + ": " + count);
			
		}
	}

	public static void main(String[] args) throws Exception {
		new cropeasy().run();
	}

}