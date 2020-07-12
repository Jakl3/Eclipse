import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class veci {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String n = file.nextLine();
		
		System.out.println(solve(n.toCharArray(), n.length()));
		
		

		file.close();
	}
	
	public int solve(char[] arr, int n) {
		int i;
		
		for(i = n-1; i > 0; i--) {
			if(arr[i] > arr[i-1]) {
				break;
			}
		}
		
		if(i == 0) return 0;
		else {
			int best = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] > arr[i-1] && arr[j] < arr[best]) best = j;
			}
			
			char temp = arr[i-1];
			arr[i-1] = arr[best];
			arr[best] = temp;
			
			Arrays.sort(arr, i, n);
		}
		
		return Integer.parseInt(Arrays.toString(arr).replaceAll("[\\[\\], ]", ""));
		
	}

	public static void main(String[] args) throws Exception {
		new veci().run();
	}

}