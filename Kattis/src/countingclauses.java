import java.util.*;
import java.io.*;

public class countingclauses {
	public static void main(String[] args) throws Exception {
		new countingclauses().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String[] vars = file.nextLine().split(" ");
		int m = Integer.parseInt(vars[0]);
		//int n = Integer.parseInt(vars[1]);
		
		System.out.println(m < 8 ? "unsatisfactory" : "satisfactory");
		
		/*if(m < 8) {
			System.out.println("unsatisfactory");
			return;
		}
		
		int[] instances = new int[n];
		
		int tot = 0;
		for(int i = 0; i < m; i++) {
			String[] in = file.nextLine().split(" ");
			for(int j = 0; j < in.length; j++) {
				int num = Integer.parseInt(in[j]);
				instances[Math.abs(num)-1] += num;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(instances[i] != 0) {
				System.out.println("unsatisfactory");
				return;
			}
		}
		
		System.out.println("satisfactory");
		*/

		file.close();
	}

}