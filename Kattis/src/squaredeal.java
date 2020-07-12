import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class squaredeal {
	
	public rect flip(rect r) {
		rect temp = new rect(r.second,r.first);
		return temp;
	}
	
	public boolean isSquare(rect a, rect b, rect c) {
		
		if(a.first == b.first && a.first == c.first) {
			if(a.second + b.second + c.second == a.first)
				return true;
			else
				return false;
		}
		
		if(a.first == b.first && a.second + b.second == c.first && a.first + c.second == c.first)
			return true;
		
		if(a.first == c.first && a.second + c.second == b.first && a.first + b.second == b.first)
			return true;
		
		if(b.first == c.first && b.second + c.second == a.first && b.first + a.second == a.first)
			return true;

		return false;
	}
	
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		rect one = new rect(file.nextInt(), file.nextInt());
		rect two = new rect(file.nextInt(), file.nextInt());
		rect three = new rect(file.nextInt(), file.nextInt());
		
		int t = one.first * one.second + two.first * two.second + three.first * three.second;
		if(Math.sqrt(t) != Math.round(Math.sqrt(t))) {
			System.out.println("NO");
			return;
		}

		boolean good = false;
		if(isSquare(one,two,three)) good = true;
		if(isSquare(flip(one),flip(two),flip(three))) good = true;
		
		if(isSquare(flip(one),two,three)) good = true;
		if(isSquare(one,flip(two),three)) good = true;
		if(isSquare(one,two,flip(three))) good = true;
		
		if(isSquare(flip(one),flip(two),three)) good = true;
		if(isSquare(flip(one),two,flip(three))) good = true;
		if(isSquare(one,flip(two),flip(three))) good = true;
		
		System.out.println(good ? "YES" : "NO");
	}

	public static void main(String[] args) throws Exception {
		new squaredeal().run();
	}

}

class rect {
	int first;
	int second;
	public rect(int f, int s) {
		first = f;
		second = s;
	}
}