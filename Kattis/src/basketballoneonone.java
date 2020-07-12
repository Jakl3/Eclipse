import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class basketballoneonone {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String[] in = file.nextLine().split("");
		
		int a = 0, b = 0;
		for(int i = 0; i < in.length-1; i+=2) {
			String person = in[i];
			int score = Integer.parseInt(in[i+1]);
			
			
			if(person.equals("A")) a += score;
			else b += score;
		}
		
		System.out.println(a > b ? "A" : "B");
	}

	public static void main(String[] args) throws Exception {
		new basketballoneonone().run();
	}

}