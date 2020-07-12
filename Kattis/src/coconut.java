import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class coconut {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int s = file.nextInt(), size = file.nextInt();
		
		List<Player> list = new ArrayList<Player>();
		for(int i = 1; i <= size; i++) {
			list.add(new Player(0, i));
		}
		
		int curr = 0;
		while(list.size() > 1) {
			int n = list.size();

			curr = (curr + s - 1) >= n ? (curr + s - 1) % n : (curr + s - 1);
			
			list.get(curr).state++;
			if(list.get(curr).state == 1)
				list.add(curr, new Player(1, list.get(curr).number));
			
			if(list.get(curr).state == 2)
				curr = curr + 1 >= n ? 0 : curr + 1;
			
			for(int i = list.size()-1; i >= 0; i--) {
				if(list.get(i).state >= 3) list.remove(i);
			}
		}
		
		System.out.println(list.get(0).number);
		

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new coconut().run();
	}
	
	private class Player {
		int state;
		int number;
		
		public Player(int s, int n) {
			state = s;
			number = n;
		}
		
		public String toString() {
			return number + " " + state;
		}
		
		
	}

}