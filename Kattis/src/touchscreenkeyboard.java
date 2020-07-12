import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class touchscreenkeyboard {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		
		HashMap<String, Pts> map = new HashMap<String, Pts>();
		map.put("q", new Pts(0,0));
		map.put("w", new Pts(1,0));
		map.put("e", new Pts(2,0));
		map.put("r", new Pts(3,0));
		map.put("t", new Pts(4,0));
		map.put("y", new Pts(5,0));
		map.put("u", new Pts(6,0));
		map.put("i", new Pts(7,0));
		map.put("o", new Pts(8,0));
		map.put("p", new Pts(9,0));
		
		map.put("a", new Pts(0,1));
		map.put("s", new Pts(1,1));
		map.put("d", new Pts(2,1));
		map.put("f", new Pts(3,1));
		map.put("g", new Pts(4,1));
		map.put("h", new Pts(5,1));
		map.put("j", new Pts(6,1));
		map.put("k", new Pts(7,1));
		map.put("l", new Pts(8,1));

		map.put("z", new Pts(0,2));
		map.put("x", new Pts(1,2));
		map.put("c", new Pts(2,2));
		map.put("v", new Pts(3,2));
		map.put("b", new Pts(4,2));
		map.put("n", new Pts(5,2));
		map.put("m", new Pts(6,2));
		
		int cases = Integer.parseInt(file.nextLine());
		for(int asdf = 0; asdf < cases; asdf++) {
			String[] firstLn = file.nextLine().split(" ");
			String hold = firstLn[0];
			int guesses = Integer.parseInt(firstLn[1]);
			
			
			ArrayList<Guess> guess = new ArrayList<Guess>();
			for(int i = 0; i < guesses; i++) {
				guess.add(new Guess(file.nextLine(), hold, map));
			}
			
			Collections.sort(guess);
			System.out.println(guess.toString().replaceAll(", ", "\n").replaceAll("[\\[\\]]",""));
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		new touchscreenkeyboard().run();
	}

}


class Guess implements Comparable<Guess> {
	String word;
	int score;
	public Guess(String word, String compare, HashMap<String, Pts> map) {
		this.word = word;
		score = 0;
		for(int i = 0; i < word.length(); i++) {
			Pts p1 = map.get(word.substring(i,i+1));
			Pts p2 = map.get(compare.substring(i,i+1));
			int temp = p1.compare(p2);
			score += temp;
		}
	}
	
	public int compareTo(Guess g) {
		if(score == g.score) {
			return this.word.compareTo(g.word);
		}
		else if(score > g.score) return 1;
		else return -1;
	}
	
	public String toString() {
		return word + " " + score;
	}
}

class Pts {
	int x;
	int y;
	public Pts(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int compare(Pts p) {
		return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
	}
	public String toString() {
		return x + "," + y;
	}
}