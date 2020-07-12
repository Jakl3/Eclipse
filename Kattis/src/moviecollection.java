import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class moviecollection {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(file.readLine());
		for(int abcd = 0; abcd < cases; abcd++) {
			
/*			StringTokenizer st = new StringTokenizer(file.readLine());
			
			int m = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			
			List<Integer> movies = new ArrayList<Integer>();
			for(int i = 0; i < m; i++) {
				movies.add(i+1);
			}
			
			st = new StringTokenizer(file.readLine());
			
			String out = "";
			for(int i = 0; i < r; i++) {
				
				int item = Integer.parseInt(st.nextToken());
				int curr = movies.indexOf(item);

				out += curr + " ";
				
				movies.remove(curr);
				movies.add(0, item);
				System.out.println(movies);
			}
			System.out.println(out.trim());*/
			
			StringTokenizer st = new StringTokenizer(file.readLine());
			int m = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			
			int[] movies = new int[m];
			for(int i = 0; i < m; i++) {
				movies[i] = i;
			}
			
			String out = "";
			
			st = new StringTokenizer(file.readLine());
			for(int i = 0; i < r; i++) {
				int item = Integer.parseInt(st.nextToken()) - 1;
				out += movies[item] + " ";
				
				if(movies[item] == 0) continue;
				movies[item] = 0;
				for(int j = 0; j < item; j++) {
					movies[j]++;
				}
			}
			
			System.out.println(out.trim());
		}
		
		file.close();
	}
	

	public static void main(String[] args) throws Exception {
		new moviecollection().run();
	}

}