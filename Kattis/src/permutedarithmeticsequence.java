// https://open.kattis.com/problems/permutedarithmeticsequence

import java.util.*;
import java.io.*;

public class permutedarithmeticsequence {
	public static void main(String[] args) throws Exception {
		new permutedarithmeticsequence().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 0; abc < cases; abc++) {
			int len = file.nextInt();
			int[] n = new int[len];
			int[] copy = new int[len];
					
			for(int i = 0; i < n.length; i++) {
				int num = file.nextInt();
				n[i] = num;
				copy[i] = num;
			}
			Arrays.sort(copy);
			
			//System.out.println(Arrays.toString(n));
			//System.out.println(Arrays.toString(copy));

			
			boolean arith1 = true;
			int prev1 = n[1] - n[0];
			
			for(int i = 2; i < n.length; i++) {
				if(n[i] - n[i-1] != prev1) {
					arith1 = false;
					break;
				}
			}
			
			boolean arith2 = true;
			int prev2 = copy[1] - copy[0];
			for(int i = 2; i < copy.length; i++) {
				if(copy[i] - copy[i-1] != prev2) {
					arith2 = false;
					break;
				}
			}
			
			//System.out.println(arith1 + " " + arith2);
			System.out.println(arith2 && !arith1 ? "permuted arithmetic" :
				arith1 && arith2 ? "arithmetic" : "non-arithmetic");
		}

		file.close();
	}

}