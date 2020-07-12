import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class princesspeach {
	public void run() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine()); 
        
        int n = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < y; i++)
			set.add(Integer.parseInt(in.readLine()));
		for(int i = 0; i < n; i++)
			if(!set.contains(i)) 
				System.out.println(i);
		
		System.out.println("Mario got " + set.size() + " of the dangerous obstacles.");
	}

	public static void main(String[] args) throws Exception {
		new princesspeach().run();
	}

}