import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class fallingapart {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int num = file.nextInt();
		
		ArrayList<Integer> pieces = new ArrayList<Integer>();
		for(int i = 0; i < num; i++)
			pieces.add(file.nextInt());
		Collections.sort(pieces, Collections.reverseOrder());
		
		int a = 0, b = 0;
		for(int i = 0; i < pieces.size(); i++) {
			if(i % 2 == 0) a += pieces.get(i);
			else b += pieces.get(i);
		}
		
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) throws Exception {
		new fallingapart().run();
	}

}