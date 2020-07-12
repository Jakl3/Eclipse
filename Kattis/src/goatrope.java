import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class goatrope {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		double x = file.nextInt(), y = file.nextInt(), x1 = file.nextInt(), y1 = file.nextInt(), x2 = file.nextInt(), y2 = file.nextInt();
/*		Position goat = new Position(x,y);
		//, one = new Point(x1,y1), two = new Point(x1,y2), three = new Point(x2,y2), four = new Point(x2,y1)
		
		double perimeter = ((Math.max(x1, x2) - Math.min(x1, x2)) * 2) + ((Math.max(y1, y2) - Math.min(y1, y2)) * 2);
		double min = 0;
		
		for(int i = 0; i < perimeter; i++) {
			
		}*/
		
		Position goat = new Position(x,y);
		Position midpoint = new Position( (x1+x2)/2 , (y1+y2)/2 );
		
		double dx = Math.max(Math.abs(goat.x - midpoint.x) - Math.abs(x1-x2)/2, 0);
		double dy = Math.max(Math.abs(goat.y - midpoint.y) - Math.abs(y1-y2)/2, 0);
		System.out.println(Math.sqrt(dx * dx + dy * dy));
	}
	
/*	public double distance(Position p1, Position p2) {
		double x = Math.pow((p2.x - p1.x), 2);
		double y = Math.pow((p2.y - p1.y), 2);
		return Math.sqrt(x + y);
	}*/

	public static void main(String[] args) throws Exception {
		new goatrope().run();
	}

}

class Position {
	double x;
	double y;
	
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return("(" + x + "," + y +")");
	}
}