import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class babybites {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(file.readLine());
		
		int curr = 1;
		StringTokenizer st = new StringTokenizer(file.readLine());
		for(int i = 0; i < numbers; i++) {
			String s = st.nextToken();
			
			if(s.equals("mumble")) curr++;
			else {
				if(Integer.parseInt(s) != curr) {
					System.out.println("something is fishy");
					return;
				}
				curr++;
			}
		}
		System.out.println("makes sense");

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new babybites().run();
	}

}