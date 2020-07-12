/*import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class flagquiz
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		file.nextLine();
		int times = file.nextInt(); 
		file.nextLine();
		String[][] in = new String[times][];

		for(int asdf = 0; asdf<times; asdf++)
		{
			in[asdf] = file.nextLine().split(", ");
		}
		
		for(String[] item : in) {
			System.out.println(Arrays.toString(item));
		}
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		for(int i = 0; i < in.length; i++) {
			int score = 0;
			for(int j = 0; j < in[i].length; j++) {
				String s = in[i][j];
				for(int e = 0; e < in.length; e++) {
					if(s.equals(in[e][j])) score++;
				}
			}
			test.add(score);
		}
		
		//System.out.println(test);
		
		int max = Integer.MIN_VALUE;
		int pos = 0;
		for(int i = 0; i < test.size(); i++) {
			if(test.get(i) > max) {
				max = test.get(i);
				pos = i;
			}
		}
		
		//System.out.println(pos);
		
		System.out.println(Arrays.toString(in[pos]).replaceAll("[\\[\\]]", ""));
		
		
	}
	

	public static void main(String[] args) throws Exception
	{
		new flagquiz().run();
	}	
	
}*/

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class flagquiz {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

		file.readLine();
		int times = Integer.parseInt(file.readLine());
		
		String[][] mat = new String[times][];
		for(int i = 0; i < times; i++) {
			mat[i] = file.readLine().split(", ");
		}
		
		int leastChanges = Integer.MAX_VALUE, pos = -1;
		ArrayList<String[]> out = new ArrayList<String[]>();
		
		for(int i = 0; i < mat.length; i++) {
			int maxChanges = 0;
			for(int j = 0; j < mat.length; j++) {
				if(i == j) continue;
				int changes = 0;
				for(int k = 0; k < mat[j].length; k++) {
					if(!mat[i][k].equals(mat[j][k])) changes++;
				}
				maxChanges = Math.max(maxChanges, changes);
			}
			if(maxChanges == leastChanges) {
				out.add(mat[i]);
			}
			else if(maxChanges < leastChanges) {
				out.clear();
				out.add(mat[i]);
				leastChanges = maxChanges;
			}
				
			
		}
		
		for(String[] item : out) {
			System.out.println(String.join(", ", item));
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		new flagquiz().run();
	}

}