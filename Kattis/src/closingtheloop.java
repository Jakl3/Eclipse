import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class closingtheloop {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = Integer.parseInt(file.nextLine());
		for(int i = 1; i <= cases; ++i) {
			int strings = Integer.parseInt(file.nextLine());
			ArrayList<Integer> red = new ArrayList<Integer>(), blue = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(file.nextLine());
			for(int j = 0; j < strings; ++j) {
				String current = st.nextToken();
				if(current.substring(current.length()-1).equals("R"))
					red.add(Integer.parseInt(current.substring(0, current.length()-1)));
				else 
					blue.add(Integer.parseInt(current.substring(0, current.length()-1)));
			}
			
			Collections.sort(blue, Collections.reverseOrder());
			Collections.sort(red, Collections.reverseOrder());
			
			int len = 0;
			int count = 0;
			while(blue.size() > 0 && red.size() > 0) {
				len += blue.remove(0);
				len += red.remove(0);
				count += 2;
			}
			System.out.printf("Case #%d: %d\n", i, len-count);
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new closingtheloop().run();
	}

}