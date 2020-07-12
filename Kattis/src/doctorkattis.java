/*import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class doctorkattis {
	
	HashMap<String, String> map = new HashMap<String, String>();
	int order = 1;
	
	
	public void ArriveAtClinic(String catName, int infectionLevel) {
		String s = infectionLevel + " " + order++;
		map.put(catName, s);
	}
	
	public void UpdateInfectionLevel(String catName, int increaseInfection) {
		
		StringTokenizer st = new StringTokenizer(map.get(catName));
		String s = (Integer.parseInt(st.nextToken()) + increaseInfection) + " " + st.nextToken();
		map.replace(catName, s);
	}
	
	public void Treated(String catName) {
		map.remove(catName);
	}
	
	public String Query() {
		int max = Integer.MIN_VALUE;
		String name = "";
		if(map.keySet().size() == 0) {
			return "The clinic is empty";
		}
		for(String item : map.keySet()) {
			String[] in = map.get(item).split(" ");
			if(Integer.parseInt(in[0]) > max) {
				max = Integer.parseInt(in[0]);
				name = item;
			}
			if(map.get(name) != null) {
				String[] in2 = map.get(name).split(" ");
				if(Integer.parseInt(in[0]) == max) {
					if(Integer.parseInt(in[1]) < Integer.parseInt(in2[1])) {
						max = Integer.parseInt(in[0]);
						name = item;
					}
				}
			}
			
			
			
		}
		
		return name;
	}
	
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

		int times = Integer.parseInt(file.readLine());

		for (int asdf = 0; asdf < times; asdf++) {
			String[] in = file.readLine().split(" ");
			if(Integer.parseInt(in[0]) == 0) {
				ArriveAtClinic(in[1], Integer.parseInt(in[2]));
			}
			else if(Integer.parseInt(in[0]) == 1) {
				UpdateInfectionLevel(in[1], Integer.parseInt(in[2]));
			}
			else if(Integer.parseInt(in[0]) == 2) {
				Treated(in[1]);
			}
			else if(Integer.parseInt(in[0]) == 3) {
				System.out.println(Query());
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new doctorkattis().run();
	}

}*/

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class doctorkattis {
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,Cat> map = new HashMap<String,Cat>();
		ValueComparator bvc = new ValueComparator(map);
		TreeMap<String,Cat> sort_map = new TreeMap<String,Cat>(bvc);
		
		int cases = Integer.parseInt(file.readLine());
		int order = 0;
		
		for(int i = 0; i < cases; i++) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			int command = Integer.parseInt(st.nextToken());
			
			if(command == 0) {
				String name = st.nextToken();
				int infectionLevel = Integer.parseInt(st.nextToken());
				
				Cat c = new Cat(name, infectionLevel, order++);
				map.put(name, c);
			}
			else if(command == 1) {
				String name = st.nextToken();
				int infectionLevel = Integer.parseInt(st.nextToken());
				
				map.get(name).UpdateInfection(infectionLevel);
			}
			else if(command == 2) {
				String name = st.nextToken();
				map.remove(name);
			}
			else if(command == 3) {
				if(map.size() == 0) {
					System.out.println("The clinic is empty");
					continue;
				}
				sort_map.clear();
				sort_map.putAll(map);
				System.out.println(sort_map.lastKey());
			}
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		new doctorkattis().run();
	}

}

class Cat {
	String name;
	int infectionLevel;
	int order;
	
	public Cat(String name, int infectionLevel, int order) { 
		this.name = name;
		this.infectionLevel = infectionLevel;
		this.order = order;
	}
	
	public void UpdateInfection(int update) {
		infectionLevel += update;
	}
	
	public int compareTo(Cat c) {
		if(this.infectionLevel == c.infectionLevel)
			if(this.order < c.order)
				return 1;
		else if(this.infectionLevel > c.infectionLevel)
				return 1;
		return -1;
	}
	
	public String toString() {
		return name + " " + infectionLevel + " " + order;
	}
}

class ValueComparator implements Comparator<String> {
    Map<String, Cat> base;

    public ValueComparator(Map<String, Cat> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        return(base.get(a).compareTo(base.get(b)));
    }
}