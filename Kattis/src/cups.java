import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cups {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		String[] cups = new String[times];
		
		for (int asdf = 0; asdf < times; asdf++) {
			String input = file.nextLine();
			String[] in = input.split(" ");
			if(in[0].matches("\\d+")) cups[asdf] = in[1] + " " + (Integer.parseInt(in[0])/2.0);
			else cups[asdf] = input;
		}
		
		Comparator<String> dab = new Comparator<String>() {
			
			public int compare(String one, String two) {
				String[] a1 = one.split(" ");
				String[] a2 = two.split(" ");
				
				if(Double.parseDouble(a1[1]) > Double.parseDouble(a2[1])) 
					return 1;
				return -1;
			}
		};
		
		Arrays.sort(cups,dab);
		
		for(String item : cups) {
			StringTokenizer st = new StringTokenizer(item);
			System.out.println(st.nextToken());
		}
	}

	public static void main(String[] args) throws Exception {
		new cups().run();
	}

}