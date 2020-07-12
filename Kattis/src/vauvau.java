import java.util.*;
import java.io.*;

public class vauvau {
	public static void main(String[] args) throws Exception {
		new vauvau().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int a = file.nextInt();
		int b = file.nextInt();
		int c = file.nextInt();
		int d = file.nextInt();
		int p = file.nextInt();
		int m = file.nextInt();
		int g = file.nextInt();
		
		int[] x = new int[2000];
		
		for(int i = 0; i < 2000; i += (a + b)) {
			for(int j = i; j < i+a && j < 2000; j++)
				x[j]++;
		}
		
		for(int i = 0; i < 2000; i += (c + d)) {
			for(int j = i; j < i+c && j < 2000; j++)
				x[j]++;
		}
		
		//System.out.println(Arrays.toString(x));
		
		String[] out = new String[] {"none", "one", "both"};
		
		
		System.out.println(out[x[p-1]]);
		System.out.println(out[x[m-1]]);
		System.out.println(out[x[g-1]]);
		
		file.close();
	}

}