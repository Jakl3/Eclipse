import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class baconeggsandspam {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		while(file.hasNext()) {
			int number = Integer.parseInt(file.nextLine());
			if(number == 0) return;
			
			TreeMap<String, TreeSet<String>> map = new TreeMap<String, TreeSet<String>>();
			
			for(int i = 0; i < number; i++) {
				String[] in = file.nextLine().split(" ");
				String name = in[0];
				
				for(int j = 1; j < in.length; j++) {
					if(map.containsKey(in[j]))
						map.get(in[j]).add(name);
					else map.put(in[j], new TreeSet<String>(Arrays.asList(name)));
				}
				
				
			}
			
			for(String key : map.keySet()) {
				System.out.print(key + " ");
				System.out.println(map.get(key).toString().replaceAll(", "," ").replaceAll("[\\[\\]]", ""));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		new baconeggsandspam().run();
	}

}