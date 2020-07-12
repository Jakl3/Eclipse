import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class unlockpattern {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		
		List<Point> list = new ArrayList<Point>();
		
		char[][] mat = new char[3][3];
		for(int i = 0; i < 3; i++) {
			mat[i] = file.nextLine().replaceAll("[ ]","").toCharArray();
			for(int j = 0; j < 3; j++) {
				list.add(new Point(i, j, mat[i][j] - 48));
			}
		}
		
		Collections.sort(list);
		double tot = 0;
		for(int i = 0; i < list.size()-1; i++) {
			tot += list.get(i).distance(list.get(i+1));
		}
		System.out.println(tot);
		
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new unlockpattern().run();
	}
	
	private class Point implements Comparable<Point> {
		int x;
		int y;
		int num;
		
		public Point(int x, int y, int num) {
			this.x = x;
			this.y = y;
			this.num = num;
		}
		
		public String toString() {
			return x + " " + y + " " + num;
		}
		
		public int compareTo(Point p) {
			return Integer.compare(this.num, p.num);
		}
		
		public double distance(Point p) {
			double x1 = Math.pow((p.x - this.x), 2);
			double y1 = Math.pow((p.y - this.y), 2);
			return Math.sqrt(x1 + y1);
		}
	}

}