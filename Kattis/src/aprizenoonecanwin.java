import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class aprizenoonecanwin {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt(), x = file.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = file.nextInt();
		}
		Arrays.sort(arr);
		
		int res = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] + arr[i-1] <= x)
				res = i + 1;
		}
		
		System.out.println(res);

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new aprizenoonecanwin().run();
	}

}