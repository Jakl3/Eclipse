import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class acm {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		TreeMap<String,Integer> map = new TreeMap<String, Integer>();
		TreeMap<String,Boolean> solved = new TreeMap<String, Boolean>();
		
		

		while(file.hasNext()) {
			String next = file.nextLine();
			if(next.equals("-1")) break;
			String[] in = next.split(" ");
			int time = Integer.parseInt(in[0]);
			String prob = in[1];
			String sol = in[2];
			
			if(sol.equals("right")) {
				if(map.containsKey(prob)) {
					map.replace(prob,map.get(prob) + time);
					solved.replace(prob, true);
				}
				else {
					map.put(prob, time);
					solved.put(prob, true);
				}
			}
			else {
				if(map.containsKey(prob)) {
					map.replace(prob,map.get(prob) + 20);
				}
				else {
					map.put(prob, 20);
					solved.put(prob, false);
				}
			}
		}
		int sum = 0, count = 0;
		for(String item : solved.keySet()) {
			if(solved.get(item)) {
				sum++;
				count+=map.get(item);
			}
		}
		
		System.out.println(sum + " " + count);
	}

	public static void main(String[] args) throws Exception {
		new acm().run();
	}

}