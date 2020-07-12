import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class leftbeehind {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			int sweet = file.nextInt(), sour = file.nextInt();
			if(sweet == 0 && sour == 0) break;
			if(sweet + sour == 13) {
				System.out.println("Never speak again.");
				continue;
			}

			System.out.println(sweet > sour ? "To the convention." : sweet == sour ? "Undecided." : "Left beehind.");
		}
	}

	public static void main(String[] args) throws Exception {
		new leftbeehind().run();
	}

}