import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class classy
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int times = file.nextInt(); 
		file.nextLine();
		
		for(int abc = 0; abc < times; abc++) {
			int people = file.nextInt();
			file.nextLine();
			List<People> list = new ArrayList<People>();
			for(int i = 0; i < people; i++) {
				String[] in = file.nextLine().split(" ");
				list.add(new People(in[1], in[0].substring(0,in[0].length()-1)));
			}
			
			Collections.sort(list);
			for(People item : list)
				System.out.println(item.name);
			System.out.println("==============================");
		}
		
		file.close();
	}

	public static void main(String[] args) throws Exception
	{
		new classy().run();
	}	
	
	private class People implements Comparable<People> {
		String name;
		ArrayList<Integer> rank;
		
		public People(String title, String name) {
			this.name = name;
			this.rank = new ArrayList<Integer>();
			
			String[] temp = title.split("-");
			for(int i = temp.length-1; i >= 0; i--) {
				switch(temp[i]) {
					case "upper" : rank.add(3); break;
					case "middle" : rank.add(2); break;
					case "lower" : rank.add(1); break;
				}
			}
			
			for (int i = 0; i < 10; i++) {
                rank.add(2);
            }
		}
		
		public String toString() {
			return name + " " + rank;
		}
		
		public int compareTo(People p) {
			int n = Math.min(this.rank.size(), p.rank.size());
			
			for (int i = 0; i < n; i++) {
                if (this.rank.get(i) == p.rank.get(i)) {
                    continue;
                }
                if (this.rank.get(i) > p.rank.get(i)) {
                    return -1;
                }
                if (this.rank.get(i) < p.rank.get(i)) {
                    return 1;
                }
            }
            return this.name.compareTo(p.name);
		}
	}
	
}