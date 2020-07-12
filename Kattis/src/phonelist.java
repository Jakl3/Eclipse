import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class phonelist {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

		int times = Integer.parseInt(file.readLine());

		for (int asdf = 0; asdf < times; asdf++) {
			
			int numbers = Integer.parseInt(file.readLine());
			ArrayList<String> nums = new ArrayList<String>();
			
			for(int ghjk = 0; ghjk < numbers; ghjk++) {
				nums.add(file.readLine());
			}
			
			Collections.sort(nums);
			
			System.out.println(go(nums) ? "YES" : "NO");
			
		}
	}
	
	public boolean go(ArrayList<String> nums) {
		
		for(int i = 0; i < nums.size()-1; i++) {
			String tester = nums.get(i);
			String testing = nums.get(i+1);
			if(testing.startsWith(tester)) return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		new phonelist().run();
	}

}