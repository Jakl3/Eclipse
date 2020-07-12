import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class fourthought {
	String[] signs = {"*", "+", "-", "/"};
	
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; ++asdf) {
			int n = file.nextInt();
			
			System.out.println(solve(n));

			
		}
	}

	public static void main(String[] args) throws Exception {
		new fourthought().run();
	}
	
	public String solve(int n) {
		
		String[] arr = new String[3];
		
		for(int i = 0; i < 4; ++i) {
			arr[0] = signs[i];
			
			for(int j = 0; j < 4; ++j) {
				arr[1] = signs[j];
				
				for(int k = 0; k < 4; ++k) {
					arr[2] = signs[k];
					
					String s = "4 " + arr[0] + " 4 " + arr[1] + " 4 " + arr[2] + " 4";
					
					List<String> sign = new ArrayList<String>(Arrays.asList(s.split("[0-9 ]")));
					sign.removeAll(new ArrayList<String>(Arrays.asList("")));
					List<String> nums = new ArrayList<String>(Arrays.asList(s.split("[^0-9]")));
					nums.removeAll(new ArrayList<String>(Arrays.asList("")));
					
					
					int temp = compute(nums, sign);
					
					if(temp == n) return s + " = " + n;
				}
			}
		}
		
		return "no solution";
	}
	
	public int compute(List<String> nums, List<String> sign) {
		int curr = 0;
		
		while(sign.contains("*") || sign.contains("/")) {
			int mult = sign.indexOf("*");
			int div = sign.indexOf("/");
			
			int pos = (mult == -1) ? div : (div == -1) ? mult : Math.min(mult, div);
			
			switch(sign.get(pos)) {
				case "*": curr = Integer.parseInt(nums.get(pos)) * Integer.parseInt(nums.get(pos+1)); break;
				case "/": curr = Integer.parseInt(nums.get(pos)) / Integer.parseInt(nums.get(pos+1)); break;
			}
			
			sign.remove(pos);
			nums.remove(pos);
			nums.remove(pos);
			nums.add(pos, "" +curr);
		}
		
		while(sign.size() > 0) {
			switch(sign.get(0)) {
				case "+": curr = Integer.parseInt(nums.get(0)) + Integer.parseInt(nums.get(1)); break;
				case "-": curr = Integer.parseInt(nums.get(0)) - Integer.parseInt(nums.get(1)); break;
			}
			sign.remove(0);
			nums.remove(0);
			nums.remove(0);
			nums.add(0, "" +curr);
		}
		return curr;
	}

}