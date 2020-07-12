import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cd
{
	public void run() throws Exception
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			
			StringTokenizer st = new StringTokenizer(file.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), count = 0;
			
			if(n == 0 && m == 0) break;

			int[] nList = new int[n];
			
			for(int i = 0; i < n; i++)
				nList[i] = Integer.parseInt(file.readLine());
			
			for(int i = 0; i < m; i++) {
				int in = Integer.parseInt(file.readLine());
				
				if(Arrays.binarySearch(nList, in) > -1)
					count++;
			}
			System.out.println(count);
		}
		
	}

	public static void main(String[] args) throws Exception
	{
		new cd().run();
	}	
	
}