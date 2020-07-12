import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kitten {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String init = file.nextLine();
		
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		while(file.hasNext()) {
			ArrayList<String> list = new ArrayList<String>(Arrays.asList(file.nextLine().split(" ")));
			String s = list.remove(0);
			if(s.equals("-1")) break;
			map.put(s, list);
		}
		

		String curr = init;
		while(true) {
			boolean found = false;
			for(String key : map.keySet()) {
				if(map.get(key).contains(curr)) {
					for(String item : map.get(key)) {
						map.remove(item);
					}
					
					curr = key;
					init += " " + key;
					found = true;
					break;
				}
			}
			if(!found) break;
		}
		

		System.out.println(init);

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new kitten().run();
	}

}