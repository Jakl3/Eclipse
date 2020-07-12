import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kornislav {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 4; i++) {
			list.add(file.nextInt());
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0) * list.get(2));
		
	}

	public static void main(String[] args) throws Exception {
		new kornislav().run();
	}

}