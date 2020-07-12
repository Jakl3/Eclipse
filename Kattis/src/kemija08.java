import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kemija08 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String vowel = "aeiou";
		
		StringBuilder in = new StringBuilder(file.nextLine());
		
		for(int i = 0; i < in.length(); i++) {
			if(vowel.indexOf(in.charAt(i)) != -1) in.delete(i+1, i+3);
		}
		
		System.out.println(in);
	}

	public static void main(String[] args) throws Exception {
		new kemija08().run();
	}

}