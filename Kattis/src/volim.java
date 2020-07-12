import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class volim {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		int currentPlayer = file.nextInt();
		
		int players = file.nextInt(); file.nextLine();

		int totalTime = 0;
		for (int asdf = 0; asdf < players; asdf++) {
			totalTime += file.nextInt();
			String answer = file.next();
			if(totalTime > 210) {
				System.out.println(currentPlayer);
				return;
			}
			if(answer.equals("T")) {
				if(currentPlayer == 8) currentPlayer = 1;
				else currentPlayer++;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new volim().run();
	}

}