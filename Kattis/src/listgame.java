import java.util.*;
import java.io.*;

public class listgame {
	public static void main(String[] args) throws Exception {
		new listgame().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		System.out.println(primeFactors(file.nextInt()));

		file.close();
	}
	
	public int primeFactors(int n) {
		List<Integer> list = new ArrayList<Integer>();
		while(n % 2 == 0) {
			list.add(2);
			n /= 2;
		}
		
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			while(n % i == 0) {
				list.add(i);
				n /= i;
			}
		}
		
		if(n > 2)
			list.add(n);
		return list.size();
	}

}