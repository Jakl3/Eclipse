import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class boundingrobots {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNext()) {
			int w = file.nextInt(), l = file.nextInt(); file.nextLine();
			if(w == 0 && l == 0) break;
			
			int segs = file.nextInt(); file.nextLine();
			Pos thinks = new Pos(0,0);
			Pos actual = new Pos(0,0);
			
			for(int abc = 0; abc < segs; abc++) {
				StringTokenizer st = new StringTokenizer(file.nextLine());
				
				String dir = st.nextToken();
				int dist = Integer.parseInt(st.nextToken());
				
				if(dir.equals("u")) {
					if(actual.y + dist <= l-1)
						actual.y += dist;
					else
						actual.y = l-1;
					
					thinks.y += dist;
				}
				else if(dir.equals("d")) {
					if(actual.y - dist >= 0)
						actual.y -= dist;
					else
						actual.y = 0;
					
					thinks.y -= dist;
				}
				else if(dir.equals("l")) {
					if(actual.x - dist >= 0)
						actual.x -= dist;
					else
						actual.x = 0;
						
					thinks.x -= dist;
				}
				else if(dir.equals("r")) {
					if(actual.x + dist <= w-1)
						actual.x += dist;
					else
						actual.x = w-1;
					
					thinks.x += dist;
				}
			}
			
			System.out.println("Robot thinks " + thinks);
			System.out.println("Actually at " + actual);
			System.out.println();
			
			
		}

		file.close();
	}
	
	private class Pos {
		int x;
		int y;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return x + " " + y;
		}
	}

	public static void main(String[] args) throws Exception {
		new boundingrobots().run();
	}

}