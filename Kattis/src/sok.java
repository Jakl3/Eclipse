import java.util.*;
import java.io.*;

public class sok {
	public static void main(String[] args) throws Exception {
		new sok().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		double[] amt = Arrays.stream(file.nextLine().split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
		int[] ratios = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		conv(ratios);
		
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < amt.length; i++) {
			min = Math.min(min, amt[i] / ratios[i]);
		}
		
		for(int i = 0; i < amt.length; i++) {
			amt[i] -= ratios[i] * min;
		}
		
		System.out.println(Arrays.toString(amt).replaceAll("[\\[\\],]", ""));
		

		file.close();
	}
	
	public void conv(int[] arr) {
		int res = arr[0];
		for(int i = 1; i < arr.length; i++) {
			res = gcd(arr[i],res);
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] /= res;
		}
	}
	
	public int gcd(int a, int b) {
		while(a!=b)
	    {
	        if(a > b)
	            a -= b;
	        else
	            b -= a;
	    }
		return a;
	}

}