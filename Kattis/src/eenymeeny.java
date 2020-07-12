import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class eenymeeny {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextLine().split(" ").length;
//		System.out.println("n " + n);
		
		List<String> team1 = new ArrayList<String>();
		List<String> team2 = new ArrayList<String>();
		
		List<String> players = new ArrayList<String>();
		int people = Integer.parseInt(file.nextLine());
		for(int i = 0; i < people; i++) {
			players.add(file.nextLine());
		}
		
//		System.out.println(players);
//		System.out.println();
		
		boolean t1 = true;
		int index = -1;
		while(!players.isEmpty()) {
			index += n;
			index %= players.size();
			
//			System.out.println("index " + index);
//			System.out.println(players);

			if(t1)
				team1.add(players.get(index));
			else 
				team2.add(players.get(index));
			
			t1 = !t1;
			players.remove(index);
			
//			System.out.println(players);
//			System.out.println(team1);
//			System.out.println(team2);
			
			index--;
			
			//System.out.println();
			
		}
		
		
		System.out.println(team1.size());
		for(int i = 0; i < team1.size(); i++)
			System.out.println(team1.get(i));
		
		System.out.println(team2.size());
		for(int i = 0; i < team2.size(); i++)
			System.out.println(team2.get(i));
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new eenymeeny().run();
	}

}