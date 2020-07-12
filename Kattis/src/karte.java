import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class karte {
	public void run() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split("");
		HashMap<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
		map.put("P", new HashSet<Integer>());
		map.put("K", new HashSet<Integer>());
		map.put("H", new HashSet<Integer>());
		map.put("T", new HashSet<Integer>());
		
		for(int i = 0; i < s.length-1; i+=3) {
			String suit = s[i];
			int number = Integer.parseInt(s[i+1] + s[i+2]);
			
			if(!map.get(suit).add(number)) {
				System.out.println("GRESKA");
				return;
			}
		}
		
		System.out.println( (13-map.get("P").size()) + " " +(13-map.get("K").size()) + " " +
				(13-map.get("H").size()) + " " + (13-map.get("T").size()));
	}

	public static void main(String[] args) throws Exception {
		new karte().run();
	}

}