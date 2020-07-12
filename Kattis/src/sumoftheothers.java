// https://open.kattis.com/problems/sumoftheothers

import java.util.*;
import java.io.*;

public class sumoftheothers {
	public static void main(String[] args) throws Exception {
		new sumoftheothers().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			int[] num = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			for(int i = 0; i < num.length; i++) {
				if(sum(num, i, num[i])) {
					System.out.println(num[i]);
					break;
				}
			}
		}

		file.close();
	}
	
	public boolean sum(int[] num, int index, int n) {
		int tot = 0;
		for(int i = 0; i < num.length; i++) {
			if(i == index) continue;
			tot += num[i];
		}
		return tot == n;
	}

}