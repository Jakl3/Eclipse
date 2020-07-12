import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cardtrick2 {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int cases = file.nextInt();
		for(int abc = 0; abc < cases; ++abc) {
			int num = file.nextInt();
			
			List<Integer> deck = new ArrayList<Integer>();
			
			for(int i = num; i > 0; i--) {
				deck.add(0, i);
				for(int j = 0; j < i; j++) {
					deck.add(0, deck.remove(deck.size()-1));
					System.out.println(deck);
				}
				System.out.println();
			}
			
			System.out.println(deck.toString().replaceAll("[\\[\\],]",""));
			
			
		}

		file.close();
	}
	

	public static void main(String[] args) throws Exception {
		new cardtrick2().run();
	}

}