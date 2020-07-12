import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ptice {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String[] adrian = "ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCA".split("");
		String[] bruno = "BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC".split("");
		String[] goran = "CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAA".split("");
		
		int times = Integer.parseInt(file.nextLine());
		String[] in = file.nextLine().split("");
		
		int[] bruh = new int[3];
		
		for(int i = 0; i < in.length; i++) {
			if(in[i].equals(adrian[i])) bruh[0]++;
			if(in[i].equals(bruno[i])) bruh[1]++;
			if(in[i].equals(goran[i])) bruh[2]++;
		}
		
		
		int max = Math.max(Math.max(bruh[0], bruh[1]), bruh[2]);
		System.out.println(max);
		for(int i = 0; i < 3; i++) {
			if(bruh[i] == max) {
				if(i == 0) System.out.println("Adrian");
				if(i == 1) System.out.println("Bruno");
				if(i == 2) System.out.println("Goran");
			}
		}
		
		

	}

	public static void main(String[] args) throws Exception {
		new ptice().run();
	}

}