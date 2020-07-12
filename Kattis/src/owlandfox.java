import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class owlandfox {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(file.readLine());
		for(int abc = 0; abc < cases; ++abc) {
			StringBuilder s = new StringBuilder(file.readLine());
			
			int i = s.length() - 1;
			while(s.charAt(i) == '0')
				i--;
			s.setCharAt(i, (char)(s.charAt(i)-1));
			
			System.out.println(Integer.parseInt(s.toString()));
			
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new owlandfox().run();
	}

}