import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class aplusb {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(file.readLine());
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//HashSet<Integer> set = new HashSet<Integer>();
		int[] arr = new int[nums];
		StringTokenizer st = new StringTokenizer(file.readLine());
		for(int i = 0; i < nums; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(2 * countWays(arr, nums));

		file.close();
	}
	
	 static int countWays(int[] arr, int n) 
	    { 
	        int max_val = 0; 
	        for (int i = 0; i < n; i++) 
	            max_val = Math.max(max_val, arr[i]); 
	        int[] freq = new int[max_val + 1]; 
	        for (int i = 0; i < n; i++) 
	            freq[arr[i]]++; 
	  
	        int ans = 0; // stores the number of ways 
	  
	        // Case 1: 0, 0, 0 
	        ans += (freq[0] * (freq[0] - 1) * (freq[0] - 2)) / 6; 
	  
	        // Case 2: 0, x, x 
	        for (int i = 1; i <= max_val; i++) 
	            ans += (freq[0] * freq[i] * (freq[i] - 1)) / 2; 
	  
	        // Case 3: x, x, 2*x 
	        for (int i = 1; 2 * i <= max_val; i++) 
	            ans += (freq[i] * (freq[i] - 1)) / 2 * freq[2 * i]; 
	  
	        // Case 4: x, y, x + y 
	        // iterate through all pairs (x, y) 
	        for (int i = 1; i <= max_val; i++) { 
	            for (int j = i + 1; i + j <= max_val; j++) 
	                ans += freq[i] * freq[j] * freq[i + j]; 
	        } 
	  
	        return ans; 
	    } 

	public static void main(String[] args) throws Exception {
		new aplusb().run();
	}


}