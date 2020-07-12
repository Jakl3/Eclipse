import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class racingalphabet {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		int times = file.nextInt();
		file.nextLine();

		double circ = Math.PI * 60;
		double spaces = circ / 28;
		
		//System.out.println(circ + " " + spaces);
		//String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ", "'"};
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int k = 65;
		for(int i = 1; i < 27; i++) {
			map.put((char)k++, i);
		}
		map.put((char)32, 27);
		map.put((char)39, 28);
		
		//System.out.println(map);
				
		
		for (int asdf = 0; asdf < times; asdf++) {
			double sum = 1;
			char[] in = file.nextLine().toCharArray();
			for(int i = 1; i < in.length; i++) {
				//System.out.println(map.get(in[1]));
				//System.out.println(map.get(in[i+1]));
				int diff = Math.abs(map.get(in[i]) - map.get(in[i-1]));
				if(diff > 14) diff = 28 - diff;
				sum+= (diff * spaces)/15.0;
				sum++;
			}
			System.out.println(sum);
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		new racingalphabet().run();
	}

}