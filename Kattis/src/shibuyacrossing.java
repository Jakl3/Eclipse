import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class shibuyacrossing {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int people = file.nextInt();
		int paths = file.nextInt();
		int max = 0;
		
		TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < paths; i++) {
			int first = file.nextInt(), second = file.nextInt();
			if(map.containsKey(first)) map.get(first).add(second);
			else {
				map.put(first, new ArrayList<Integer>());
				map.get(first).add(second);
			}
		}
		
		System.out.println(map);
		
		int maxCount = 2;
		for(int item : map.keySet()) {
			int count = 1;
			ArrayList<Integer> temp = map.get(item);
			for(int i = 0; i < temp.size(); i++) {
				int check = temp.get(i);
				System.out.println(item + " " + check);
				
				if(map.get(check) != null) {
					ArrayList<Integer> tempChecker = map.get(check);
					System.out.println(tempChecker);
					for(int j = 0; j < tempChecker.size(); j++) {
						if(temp.contains(tempChecker.get(j))) count++;
						System.out.println(tempChecker.get(j) + " c " + count);
					}
				}
				
			}
			if(count > maxCount) maxCount = count;
		}
		
		System.out.println(maxCount);
	}

	public static void main(String[] args) throws Exception {
		new shibuyacrossing().run();
	}

}