import java.util.*;
import java.io.*;

public class rationalsequence3 {
	public static void main(String[] args) throws Exception {
		new rationalsequence3().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int abc = 0; abc < cases; ++abc) {
			int k = file.nextInt(), n = file.nextInt();
			int den = 1, num = 1;
			String[] s = Integer.toString(n, 2).split("");
			for(int i = 1; i < s.length; i++) {
				if(s[i].equals("0"))
					den += num;
				else
					num += den;
			}
			
			System.out.printf("%d %d/%d\n", k, num, den);
			
		}

		file.close();
	}

}