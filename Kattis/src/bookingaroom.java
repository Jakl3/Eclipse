import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bookingaroom {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int r = file.nextInt(), n = file.nextInt();
		if(r == n) {
			System.out.println("too late");
			return;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < n; i++) {
			set.add(file.nextInt());
		}
		
		for(int i = 1; i <= r; i++) {
			if(set.add(i) == true) {
				System.out.println(i);
				break;
			}
		}
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new bookingaroom().run();
	}

}