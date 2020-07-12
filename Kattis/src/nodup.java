import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class nodup {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		String[] in = file.nextLine().split(" ");
		HashSet<String> set = new HashSet<String>();
		
		boolean flag = true;
		
		for(String item: in) {
			if(set.add(item) == false) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? "yes" : "no");
	}

	public static void main(String[] args) throws Exception {
		new nodup().run();
	}

}