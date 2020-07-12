import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class zoo {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int caseNum = 1;
		while(file.hasNext()) {
			int num = Integer.parseInt(file.nextLine());
			if(num == 0) break;
			
			Map<String, Integer> map = new TreeMap<String, Integer>();
			for(int i = 0; i < num; i++) {
				String[] s = file.nextLine().toLowerCase().split(" ");
				if(map.get(s[s.length-1]) == null) {
					map.put(s[s.length-1], 1);
				}
				else {
					map.put(s[s.length-1], map.get(s[s.length-1]) + 1);
				}
			}
			
			System.out.println("List " + caseNum + ":");
			System.out.println(map.toString().replaceAll("[{}]", "").replaceAll(", ", "\n").replaceAll("="," | "));
			
			caseNum++;
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new zoo().run();
	}

}