import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class skocimis {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		/*Scanner file = new Scanner(System.in);

		int a = file.nextInt()-1, b = file.nextInt()-1, c = file.nextInt()-1;
		int[] line = new int[Math.max( Math.max(a, b) , c )];
		line[a] = 1;
		line[b] = 1;
		line[c] = 1;
		
		while(!isNext(a,b,c)) {
			
		}
		
		System.out.println(Arrays.toString(line));*/
		
		int a = file.nextInt(), b = file.nextInt(), c = file.nextInt();
		System.out.println(Math.max( Math.abs(b-a) , Math.abs(c - b) ) - 1);
	}

/*	public boolean isNext(int a, int b, int c) {
		int[] in = {a,b,c};
		Arrays.sort(in);
		return(in[1] == in[0] + 1 && in[2] == in[1] + 1);
	}*/
	
	public static void main(String[] args) throws Exception {
		new skocimis().run();
	}

}