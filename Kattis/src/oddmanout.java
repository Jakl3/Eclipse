import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class oddmanout {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			int guests = file.nextInt();
			for(int i = 0; i < guests; i++) {
				int in = file.nextInt();
				if(map.containsKey(in) == false) map.put(in, 1);
				else map.replace(in, map.get(in)+1);
			}
			
			for(int item : map.keySet()) {
				if(map.get(item) == 1) {
					System.out.println("Case #" + (asdf+1) + ": " + item);
					break;
				}
			}
			
		}
	}

	public static void main(String[] args) throws Exception {
		new oddmanout().run();
	}

}