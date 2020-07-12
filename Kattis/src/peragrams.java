import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class peragrams {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		System.out.println(peragram(file.nextLine()));

		file.close();
	}
	
	public int peragram(String s) {
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++)
			count[s.charAt(i) - 'a']++;
		
		int odd = 0;
		for(int item : count) {
			if(item % 2 != 0)
				odd++;
		}
		
		return odd == 0 || odd == 1 ? 0 : odd-1;
	}

	public static void main(String[] args) throws Exception {
		new peragrams().run();
	}

}