import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tsp {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			int points = file.nextInt();
			HashMap<Pt,Integer> map = new HashMap<Pt,Integer>();
			ArrayList<Pt> list = new ArrayList<Pt>();
			for(int i = 0; i < points; i++) {
				list.add(new Pt(file.nextDouble(), file.nextDouble()));
			}
			
			map.put(list.get(0), 0);
			Pt current = list.get(0);
			for(int i = 1; i < list.size(); i++) {
				double best = Integer.MAX_VALUE;
				int save = 0;
				for(int j = 0; j < list.size(); j++) {
					if(map.containsKey(list.get(j))) continue;
					if(current.distance(list.get(j)) < best) {
						best = current.distance(list.get(j));
						save = j;
					}
				}
				current = list.get(save);
				map.put(list.get(save), i);
			}
			
			for(Pt item : list) {
				System.out.println(map.get(item));
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new tsp().run();
	}

}

class Pt {
	
	double x;
	double y;
	
	public Pt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Pt test) {
		double xtest = test.x - this.x;
		double ytest = test.y - this.y;
		return Math.sqrt((xtest * xtest) + (ytest * ytest));
		
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}


/*import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tsp {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		while(file.hasNext()) {
			int points = file.nextInt(); file.nextLine();
			ArrayList<Integer> out = new ArrayList<Integer>();
			while(out.size() < points) {
				boolean go = true;
				while(go) {
					int in = (int)(Math.random() * points);
					if(out.contains(in) == false) {
						out.add(in);
						go = false;
					}
				}
			}
			for(int i = 0; i < points; i++) {
				System.out.println(out.get(i));
				file.nextLine();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new tsp().run();
	}

}*/