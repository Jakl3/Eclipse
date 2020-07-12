import java.util.*;
import java.io.*;

public class brokenswords {
	public static void main(String[] args) throws Exception {
		new brokenswords().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int swords = Integer.parseInt(file.nextLine());
		int tb = 0, lr = 0;
		
		for(int i = 0; i < swords; i++) {
			int[] in = Arrays.stream(file.nextLine().split("")).mapToInt(n -> Integer.parseInt(n)).toArray();
			if(in[0] == 0) tb++;
			if(in[1] == 0) tb++;
			if(in[2] == 0) lr++;
			if(in[3] == 0) lr++;
		}
		
		/*int n = Math.min(tb/2, lr/2);
		if(n == 0)
			System.out.printf("%d %d %d\n", 0, tb, lr);
		else
			System.out.printf("%d %d %d\n", n, tb % n, lr % n);*/
		
		int count = 0;
		while(tb >= 2 && lr >= 2) {
			tb -= 2;
			lr -= 2;
			count++;
		}
		
		System.out.println(count + " " + tb + " " + lr);

		file.close();
	}

}