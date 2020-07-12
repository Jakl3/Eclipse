import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.*;

public class roundedbuttons {
	public void run() throws Exception {
		Kattio file = new Kattio(System.in);
		int cases = file.nextInt();
		
		for(int asdf = 0; asdf < cases; asdf++) {
			double x = file.nextDouble(), y = file.nextDouble(), w = file.nextDouble(), h = file.nextDouble(), r = file.nextDouble();
			
			
			Point2D topLeft = new Point2D.Double(x+r, y+r);
			Point2D topRight = new Point2D.Double((x+w)-r, y+r);
			Point2D botLeft = new Point2D.Double(x+r, (y+h)-r);
			Point2D botRight = new Point2D.Double((x+w)-r, (y+h)-r);
			
			System.out.println(topLeft);
			System.out.println(topRight);
			System.out.println(botLeft);
			System.out.println(botRight);
			System.out.println();
			
			int m = file.nextInt();
			for(int i = 0; i < m; i++) {
				Point2D temp = new Point2D.Double(file.nextDouble(), file.nextDouble());
				System.out.println(temp);
				boolean corners = false;
				
				if(temp.distance(topLeft) <= temp.distance(new Point2D.Double(x,y)) ||
						temp.distance(topRight) <= temp.distance(new Point2D.Double(x+w,y)) ||
						temp.distance(botLeft) <= temp.distance(new Point2D.Double(x,y+h)) ||
						temp.distance(botRight) <= temp.distance(new Point2D.Double(x+w,y+h))) corners = true;
				
				boolean inside = false;
				
				System.out.println("CORNERS");
				System.out.println(temp.distance(topLeft));
				System.out.println(temp.distance(topRight));
				System.out.println(temp.distance(botLeft));
				System.out.println(temp.distance(botRight));
				
				if(corners) {
					System.out.println("inside");
				}
				else
					System.out.println("outside");
			}
			System.out.println();
			
		}

		file.close();
	}

	public static void main(String[] args) throws Exception {
		new roundedbuttons().run();
	}
	
/*	public static double distance(Point p1, Point p2) {
		double x = Math.pow(p2.x-p1.x, 2);
		double y = Math.pow(p2.y-p1.y, 2);
		
		return Math.sqrt(x + y);
	}
	
	private class Point {
		double x;
		double y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "(" + x + ", " + y + ")";
		}
	}*/

	private class Kattio extends PrintWriter {

		private BufferedReader r;
		private String line;
		private StringTokenizer st;
		private String token;

		public Kattio(InputStream i) {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(i));
		}

		public Kattio(InputStream i, OutputStream o) {
			super(new BufferedOutputStream(o));
			r = new BufferedReader(new InputStreamReader(i));
		}

		public boolean hasNext() {
			return peekToken() != null;
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public String next() {
			return nextToken();
		}

		public String nextLine() {
			token = null;
			st = null;
			try {
				return r.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		private String peekToken() {
			if (token == null)
				try {
					while (st == null || !st.hasMoreTokens()) {
						line = r.readLine();
						if (line == null)
							return null;
						st = new StringTokenizer(line);
					}
					token = st.nextToken();
				} catch (IOException e) {
				}
			return token;
		}

		private String nextToken() {
			String ans = peekToken();
			token = null;
			return ans;
		}
	}

}