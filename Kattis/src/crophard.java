import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class crophard {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

		int times = Integer.parseInt(file.readLine());

		for (int asdf = 0; asdf < times; asdf++) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), 
					d = Integer.parseInt(st.nextToken()), x0 = Integer.parseInt(st.nextToken()), y0 = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			ArrayList<double[]> trees = new ArrayList<double[]>();
			
			double x = x0, y = y0;
			trees.add(new double[] {x%3,y%3});
			for(int i = 1; i < n; i++) {
				
				x = (a * x + b) % m;
				y = (c * y + d) % m;
				trees.add(new double[] {x%3,y%3});
			}
			
			/*			
			for(double[] item : trees) {
				System.out.println(Arrays.toString(item));
			}*/
			
			/*int count = 0;
			for(int i = 0; i < trees.size()-2; i++) {
				for(int j = i+1; j < trees.size()-1; j++) {
					for(int k = j+1; k < trees.size(); k++) {
						
						double[] a1 = trees.get(i);
						double[] a2 = trees.get(j);
						double[] a3 = trees.get(k);
						
						double xfin = (a1[0]+a2[0]+a3[0]);
						double yfin = (a1[1]+a2[1]+a3[1]);
						if(xfin % 3 == 0 && yfin % 3 == 0) count++;
					}
				}
			}
			
			System.out.println("Case #" + (asdf+1) + ": " + count);*/
			
			int count = 0;
			for(int i = 0; i < trees.size()-1; i++) {
				HashSet<double[]> set = new HashSet<double[]>();
				
			}
			
		}
	}

	public static void main(String[] args) throws Exception {
		new crophard().run();
	}

}