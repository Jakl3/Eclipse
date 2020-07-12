import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Double.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hittingtargets {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int targets = Integer.parseInt(file.nextLine());
		List<shape> list = new ArrayList<shape>();
		
		for(int i = 0; i < targets; i++) {
			String[] in = file.nextLine().split(" ");
			if(in[0].equals("rectangle")) {
				double x1 = Double.parseDouble(in[1]);
				double y1 = Double.parseDouble(in[2]);
				double x2 = Double.parseDouble(in[3]);
				double y2 = Double.parseDouble(in[4]);
				
				list.add(new shape(true, x1, y1, x2, y2));
			}
			else {
				double x = Double.parseDouble(in[1]);
				double y = Double.parseDouble(in[2]);
				double r = Double.parseDouble(in[3]);
				
				list.add(new shape(false, x, y, r));
			}
		}
		
		int points = Integer.parseInt(file.nextLine());
		for(int i = 0; i < points; i++) {
			double x = file.nextDouble(), y = file.nextDouble();
			//System.out.println(x + " " + y);
			int count = 0;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).intersects(x,y))
					count++;
			}
			System.out.println(count);
		}
		

		file.close();
	}
	
	private class shape {
		boolean rect;
		
		double x1;
		double y1;
		double x2;
		double y2;
		
		double x;
		double y;
		double r;
		
		public shape(boolean rect, double x1, double y1, double x2, double y2) {
			this.rect = rect;
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
		public shape(boolean rect, double x, double y, double r) {
			this.rect = rect;
			this.x = x;
			this.y = y;
			this.r = r;
		}
		
		public boolean intersects(double x, double y) {
			//System.out.println(toString());
			
			if(rect) {
				return(x >= x1 && x <= x2 && y >= y1 && y <= y2);
			}
			else {
				double x1 = Math.pow(this.x - x, 2);
				double y1 = Math.pow(this.y - y, 2);
				
				double res = Math.sqrt(x1 + y1);
				
				return res <= r;
			}
		}
		
		public String toString() {
			if(rect)
				return "rect " + x1 + " " + y1 + " " + x2 + " " + y2;
			else
				return "circ " + x + " " + y + " " + r;
		}
	}

	public static void main(String[] args) throws Exception {
		new hittingtargets().run();
	}

}